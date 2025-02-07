package ex_11_while_loop;

import java.util.Scanner;

public class Lab119_count_digit {
    public static void main(String[] args){
        //Count Digits in a Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        int num = num1;
        int count = 0;
        while(num>0){
            int digit = num%10;
            count++;
            num=num/10;
        }
        System.out.printf("Number of digit in %d is : %d",num1,count);
    }
}
