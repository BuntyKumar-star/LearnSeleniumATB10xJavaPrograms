package exception;

public class Lab_2024_exception {
    public static void main(String[] args){
        System.out.println("Start the program");
//        String ip = args[0];         // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
//        int a = Integer.parseInt(ip);         // java.lang.NumberFormatException: For input string: "pramod"
//        int b = 100/a;         // java.lang.ArithmeticException: / by zero when args -> 0
//
//        System.out.println(b);
//        System.out.println("End the program");

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

        String ip = args [0]; // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
        int a = Integer.parseInt(ip);// java.lang.NumberFormatException: For input string: "pramod"
        int b = 100/a; // java.lang.ArithmeticException: / by zero when args -> 0

        System.out.println(b);
        System.out.println("End of program");

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds

    }
}
