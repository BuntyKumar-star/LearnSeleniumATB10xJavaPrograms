package ex_05_java_basics_Type_casting;

public class Lab049_type_casting {
    public static void main(String[] args){
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit ?
        System.out.println(s);
    }
}
