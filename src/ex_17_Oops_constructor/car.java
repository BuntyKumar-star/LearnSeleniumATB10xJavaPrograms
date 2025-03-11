package ex_17_Oops_constructor;

public class car {
    String name;
    String model;
    int year;

    car() {
        name = "Unknown car";
        model = "XXXX";
        year = 0;
        System.out.println("Default constructor");
    }

}
