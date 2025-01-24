package ex_05_java_basics_Type_casting;

public class Lab048_type_casting_narrowing {
    public static void main(String[] args){
        int val  = 200;
//        byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte)val; // // // Valid -> Explicit Casting -  allowed
        // Data Loss:
    }
}
