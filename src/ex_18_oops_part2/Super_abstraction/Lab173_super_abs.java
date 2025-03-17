package ex_18_oops_part2.Super_abstraction;

public class Lab173_super_abs {
    public static void main(String[] args){
        Car c1 = new Car(100);
        c1.notes();
        c1.message();
        c1.message(23);
        c1.message(12,23);
        c1.notes();
        c1.display();

    }
}

class Vehicle{
    public int max_speed = 180;
    Vehicle(){
        System.out.println("Default cons");
    }

    Vehicle(int a){
        System.out.println("param cons" +a);
    }
// Method overloading same name function/method with different return type/arguments
    void message(){
        System.out.println("No return type No arguments");
    }
    void message(int a){
        System.out.println("No return type with argument" +a);
    }
    int message (int a, int b){
        System.out.println("return type int with argument");
        return a+b;

    }
    void notes(){
        System.out.println("vehicle notes");
            }

    void display(){
        System.out.println("Parent Display....");
    }

}
// Single inheritence
class Car extends Vehicle{
    private int max_speed = 200;
//    Car(){
//        super(100);
//    }
    Car(int a){
        super(200);
        System.out.println("car param cons" +a);
    }
    void test(){}

    void display(){
        System.out.println("overide car");
        System.out.println("car max speed" +this.max_speed);
        System.out.println("Vehicle max speed" +super.max_speed);
        this.test();
        super.notes();
    }

}
