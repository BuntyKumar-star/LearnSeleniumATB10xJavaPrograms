package practice_tasks;

import java.util.Scanner;

public class Lab135_max_of_2_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of number 2 : ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.printf("Number %d is maximum",num1);
        }
        else{
            System.out.printf("Number %d is maximum",num2);
        }
        sc.close();
    }
}
