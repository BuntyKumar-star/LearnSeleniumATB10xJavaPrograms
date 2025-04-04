package exception;

public class Lab211_multiple_programs {
    public static void main(String[] args){
        int a = 0;
        int c = 0;
        try{
            c = 10/a;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            String s1 = null;
            s1.trim();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
