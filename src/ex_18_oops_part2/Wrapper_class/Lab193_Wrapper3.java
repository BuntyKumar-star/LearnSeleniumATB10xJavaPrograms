package ex_18_oops_part2.Wrapper_class;

public class Lab193_Wrapper3 {
    public static void main(String[] args){
        int a = 10;
        Integer b = a; // Boxing - int -> Interger  - JVM -> AutoBoxing
        // Autoboxing ->  a don att, be
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 = 42;
        int v = a2; // Unboxing -
        System.out.println(v);
    }
}
