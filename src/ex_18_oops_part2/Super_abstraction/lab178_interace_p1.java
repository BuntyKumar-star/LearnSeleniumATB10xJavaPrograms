package ex_18_oops_part2.Super_abstraction;

public class lab178_interace_p1 {
    public static void main(String[] args){
        Car1 c1 = new Car1();
        c1.start();
        c1.applyBreaks();
        c1.stop();
        c1.drive();


    }
}

class Car1 implements Engine2, breaks2{


    void drive(){
        start();
        stop();
        applyBreaks();
    }
    public void start(){
        System.out.println("start engine");
    }
    public void stop(){
        System.out.println("stop engine");
    }

    public void applyBreaks(){
        System.out.println("apply breaks engine");
    }
}
interface Engine2{
    void start();
    void stop();
    // to create concrete/complete method in interface need to use default keyword
    default void test(){
        System.out.println("test interface method");
    }
}

interface breaks2{
    void applyBreaks();
}
