package practice_tasks;

import java.util.Scanner;

public class Lab143_multiplication_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value for multiplication : ");
        int num = sc.nextInt();
        int row = 10;
        for (int i=1 ;i<=row ; i++){
            System.out.println(num+ "*" + i +"= " +(num*i));
        }
        sc.close();
    }
}
