package ex_18_oops_part2.Polymorphism.methodOveriding;

public class Lab170_MOveride {
    public static void main(String[] args){
        Bunty b1 = new Bunty();
        b1.home();
        b1.p1();
        b1.f1();
        Father x1 = new Father();
        x1.f1();
        x1.home();

        Father s1 = new Bunty();//Dynamic Dispatch
        s1.home();//Method overiding
        s1.f1();
    }
}
