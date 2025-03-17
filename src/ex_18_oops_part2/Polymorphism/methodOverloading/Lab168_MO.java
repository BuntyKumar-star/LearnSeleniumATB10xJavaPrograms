package ex_18_oops_part2.Polymorphism.methodOverloading;

import java.util.concurrent.atomic.DoubleAdder;

public class Lab168_MO {
    public static void main(String[] args){
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(5,6);
        int r2 = m1.add(5,6,7);
        Double r3 = m1.add(34.2,45.3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
