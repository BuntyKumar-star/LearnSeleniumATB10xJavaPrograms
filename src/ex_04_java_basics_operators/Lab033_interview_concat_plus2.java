package ex_04_java_basics_operators;

public class Lab033_interview_concat_plus2 {
    public static void main(String[] args){
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PramodDutta



        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
