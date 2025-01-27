package ex_07_java_incremental_decremental;

public class Lab088_expression {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10, a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA + ExpB -> 10+12 -> 22







    }
}
