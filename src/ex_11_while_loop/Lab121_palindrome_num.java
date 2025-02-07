package ex_11_while_loop;

import java.util.Scanner;

public class Lab121_palindrome_num {
    //palindrome number
    //reverse of given number should be same as 121 == 121
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number to check palindrome");
        int num1 = sc.nextInt();
        int num = num1;
        int palindrome=0;
        while (num>0){
            int digit = num%10;
            palindrome = palindrome*10 + digit;
            num=num/10;
        }
        System.out.println("output of number :" +palindrome);
        if (palindrome==num1){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }

    }
}
