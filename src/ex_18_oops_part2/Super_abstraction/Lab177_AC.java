package ex_18_oops_part2.Super_abstraction;

public class Lab177_AC {
    public static void main(String[] args){
        Wagonr car1 = new Wagonr();
        car1.startEngine();
        car1.drive();
//        car1.m1();

    }
}

class Wagonr extends Engine {
    void startEngine(){
        System.out.println("Start Engine");
    }

    void drive(){
        startEngine();
        System.out.println("I am driving car");
        stopEngine();
    }
//    void m1(){
//        System.out.println("interface tyre method m1");
//    }
}

abstract class Engine{
    Engine(){
        //This is useless
    }
  abstract void startEngine();
    void stopEngine(){
        System.out.println("Stop Engine");
    }
}

interface breaks {

}
interface tyre {
    void m1();
    void m2();
        //No constructor
    //no concrete/complete method
}
