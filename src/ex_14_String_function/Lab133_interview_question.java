package ex_14_String_function;

public class Lab133_interview_question {
    public static void main(String[] args){
        String s1 = "Hello";//SCP
        String s4 = "Hello";//SCP
        String s10 = "Hello";//SCP
        String s2 = new String("Hello");//OA
        String s3 = new String("hello");//heap memory/OA
        String s5 = new String("Hello");//OA

        System.out.println(s1==s2);//false > reason> == compare reference location(SCP==OA >>false)
        System.out.println(s1==s4);//true >>SCP==SCP
        System.out.println(s1.equals(s2));
        System.out.println(s4.equals(s3));
        System.out.println(s4.equalsIgnoreCase(s3));


    }
}
