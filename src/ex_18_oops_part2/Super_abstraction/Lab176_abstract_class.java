package ex_18_oops_part2.Super_abstraction;

public class Lab176_abstract_class {
    public static void main(String[] args){
        Child c1 = new Child();
        c1.loan50k();
        c1.loan25k();

        //Abstract class don't have any object
//        Father f1 = new Father() {
//            @Override
//            void loan50k() {
//
//            }
//        }
    }
}


// abstract class -
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 20K");
    }
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan!");
    }
}
