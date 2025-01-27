package ex_08_java_basic_conditions_if_else;

import java.util.Scanner;

public class Lab_072_if_condition {
    public static void main(String[] args){
        // Allowed to vote or not
        //  If age > 18 -> allowed to vote.
        //        // else age < >18 -> Not allowed to vote.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age !(as integer)");
        int age = sc.nextInt();//java.util
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Not allowed to vote");
        }
    }
}
