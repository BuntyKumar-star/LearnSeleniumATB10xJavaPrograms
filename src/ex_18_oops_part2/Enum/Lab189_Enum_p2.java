package ex_18_oops_part2.Enum;

public class Lab189_Enum_p2 {
    public static void main(String[] args){
        System.out.println(URLs.katalon);
        if(URLs.katalon.equals("katalon")){
            System.out.println("I want to do something");
        }
    }
}

enum URLs{
    google, restassured, katalon, vwo
}
