package ex_17_Oops_constructor;

public class Cars2 {
    String name;
    int year;
    Cars2(){
        System.out.println("Default constructor");
        name = "Tesla2";
        year = 2023;

    }

    Cars2(String model_name, int year_created){// paramterized constructor
        this.name = model_name;
        // this keyword used to refer local variable
        this.year = year_created;

    }
}
