package ex_11_while_loop;

import java.util.Scanner;

public class Lab120_perfect_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for perfect number check");
        int num1 = sc.nextInt();
        int num = num1;
        int perf = 0;
        int i =1;
        while(i<=num/2){
           if (num%i==0){
               perf = perf + i;
           }
           i++;
        }
        System.out.println("perfect num value : "+perf);
        if (perf==num1) {
            System.out.println("Given number is perfect number");
        }else {
                System.out.println("Given number is not perfect number");
        }
    }
}
