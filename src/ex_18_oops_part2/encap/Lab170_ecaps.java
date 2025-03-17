package ex_18_oops_part2.encap;

public class Lab170_ecaps {
    public static void main(String[] args){
        //## Encapsulation
        //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
        //- Bundling of data and methods that operate on that data within a single unit.
        //- Data members should be private in nature.
        //- Methods with getter and setter only, you can access the data members / attributes.

        VWOLogin m1 = new VWOLogin("buntys", "bunty123");
        System.out.println(m1.username);
        System.out.println(m1.password);
        m1.username = "buntySingh";
        m1.password = "Bunty1234";
        System.out.println(m1.username);
        System.out.println(m1.password);

        GoodencapVWOLogin m2 = new GoodencapVWOLogin("Laatsahab", "Singh123");
        System.out.println(m2.getUsername());
        System.out.println(m2.getPassword());
        m2.setUsername("Laatsahab ji");
        m2.setPassword("Laat1234", false);
        System.out.println(m2.getUsername());
        System.out.println(m2.getPassword());


    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String usr, String psw){
        this.username = usr;
        this.password = psw;
    }
}

class GoodencapVWOLogin{
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String usr){
        this.username = usr;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String psw, boolean IsAdmin){
        if(IsAdmin) {
            this.password = psw;
        }
        else{
            System.out.println("Not allowed to set password");
        }
    }

    public GoodencapVWOLogin(String usr, String psw){
        this.username = usr;
        this.password = psw;
    }

}
