package ex_08_java_basic_conditions_if_else;

import java.util.Scanner;

public class Lab078_if_else_ifelse {
        public static void main(String[] args) {

            // num1 and num2
            // num1 >  num 2 - 1
            // num1 <  num 2 - 2
            // num1 ==  num 2 - 3

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the num1");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2");
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("num1");
            } else if (num2 > num1) {
                System.out.println("num2");
            } else {
                System.out.println("Equal");
            }

        }
}
