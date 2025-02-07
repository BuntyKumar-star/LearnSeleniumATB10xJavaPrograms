package ex_11_while_loop;

import java.util.Scanner;

public class Lab117_reverse_num {
    public static void main(String[] args){
        // Reverse the digits of a given number using a while loop.
        //    Example: 123 -> 321
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number value - ");
        int num = sc.nextInt();
        int sum=0;
        while (num>0){
            int digit = num%10;
            sum = sum*10 + digit;
            num=num/10;
        }
        System.out.println("Reverse of num is -"+sum);
    }
}
