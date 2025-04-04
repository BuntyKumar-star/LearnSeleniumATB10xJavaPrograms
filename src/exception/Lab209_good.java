package exception;

public class Lab209_good {
    public static void main(String[] args){
        int c =0;
        int b = 0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) { // use the exact exception that shown not parent directly as (Exception e)
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
