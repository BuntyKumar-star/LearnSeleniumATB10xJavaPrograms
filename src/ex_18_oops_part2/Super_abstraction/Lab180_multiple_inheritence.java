package ex_18_oops_part2.Super_abstraction;

public class Lab180_multiple_inheritence {
    public static void main(String[] args){
        Son s1 = new Son();
        s1.money();
        s1.f1();
        s1.m1();
    }
}

class Son implements Father1,Mother1 {
    public void money() {
        System.out.println("Father's money");
    }
    public void m1(){
        System.out.println("m1.......");
    }
    public void f1(){
        System.out.println("f1.......");
    }
}

interface Mother1{
    void money();
    void m1();
}

interface Father1{
    void money();
    void f1();

    default void ff(){
        System.out.println("This is only allowed!");
    }
}
