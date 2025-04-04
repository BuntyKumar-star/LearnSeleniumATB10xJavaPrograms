package ex_18_oops_part2.Wrapper_class;

public class Lab192_Wrapper2 {
    public static void main(String[] args){
        ATB a3 = new ATB();
        System.out.println(a3.phone);

    }
}

class ATB {
    String name;
    Long phone;
    Integer salary;
    Float GST;
    Boolean isMarried;
    //int -> data Type
    // Integer - class - who object can be created.

    // Why Java is not pure OOPs? - Becoz -> primitive data types.
}
