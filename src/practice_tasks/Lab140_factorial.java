package practice_tasks;

import java.util.Scanner;

public class Lab140_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number : ") ;
        int num = sc.nextInt();
        int fact = 1;
        for(int i=num ; i>=1 ;i--){
         fact = fact*i;
        }
        System.out.println("Value of factorial of number is : " +fact);
    }
}
