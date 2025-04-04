package ex_18_oops_part2.Super_abstraction;

public class Lab175_private_class {
    public static void main(String[] args){
        CAB c1 = new CAB();
        c1.display();
        System.out.println(c1.my_gold);
    }

}

 class XYZ {//private not allowed

     XYZ() {

     }


     protected int my_gold = 10;
 }
    class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
}