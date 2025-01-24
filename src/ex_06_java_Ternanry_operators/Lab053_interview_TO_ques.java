package ex_06_java_Ternanry_operators;

public class Lab053_interview_TO_ques {
    public static void main(String[] args){
        //Nested Ternary operators
        //result = condition? expression1 : (condition ? expression3: expression4);
        int number = 15;
        String result = number > 10? (number > 20 ? "G > 20" : "B/W 15-20") : "Less than 10";
        System.out.println(result);
    }
}
