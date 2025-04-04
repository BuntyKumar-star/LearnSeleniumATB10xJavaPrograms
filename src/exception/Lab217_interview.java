package exception;

public class Lab217_interview {
    public static void main(String[] args){
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("I will be executed any how");
        }

    }
}
