package ex_17_Oops_constructor;

public class Lab160_oops_java {
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1);

    }
}

class A{
    A(){
        System.out.println("I want to read a file as constructor created");
    }
        }