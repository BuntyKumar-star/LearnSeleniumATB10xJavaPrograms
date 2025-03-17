package ex_18_oops_part2.encap;

public class Lab171_real_example {
    public static void main(String[] args){
        ICCS m1 = new ICCS("bunty", 239949);
        System.out.println(m1.getBal());
        m1.setBal(24984, true);
        System.out.println(m1.getBal());
    }
}

class ICCS{
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name ;
    private long bal;
    private String bankName;

    public  ICCS(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getBal(){
        return bal;
    }
    public void setBal(long bal, boolean IsCashier){
        if (IsCashier) {
            this.bal = bal;
        }
        else{
            System.out.println("not allowed to change bal...");
        }
    }
}
