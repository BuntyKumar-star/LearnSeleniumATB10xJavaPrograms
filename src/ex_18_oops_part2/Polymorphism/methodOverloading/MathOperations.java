package ex_18_oops_part2.Polymorphism.methodOverloading;

public class MathOperations {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
