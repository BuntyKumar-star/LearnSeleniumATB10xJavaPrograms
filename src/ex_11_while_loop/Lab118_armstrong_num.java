package ex_11_while_loop;

import java.util.Scanner;

public class Lab118_armstrong_num {
    public static void main(String[] args){
        /*Check if a number is Armstrong number using while loop.
        (Sum of cubes of digits equals the number)
        Example: 153 = 1^3 + 5^3 + 3^3
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num value : ");
        int num1 = sc.nextInt();
        int num = num1;
        int arms = 0;
        int digit = 0;
        while (num>0){
            digit = num%10;
            arms = arms + digit*digit*digit;
            System.out.print(arms+"+");
            num=num/10;

        }
        if(num1==arms) {
            System.out.printf("entered number is %d%n, and armstrong number is %d", num1, arms);
        }
        else {
            System.out.printf("%d is not armstrong num as %d not equal to %d",num1,arms,num1 );
        }
        //Scanner.close();
    }
}
