package ex_06_java_Ternanry_operators;

public class Lab051_Ternary_operator {
    //result = condtion? expression1: expression2
    public static void main(String[] args){
        int age = 10;
        String canIVote =  age >= 18 ? "Yes, You can vote" : "No, You can't Vote";
        System.out.println(canIVote);
    }

}
