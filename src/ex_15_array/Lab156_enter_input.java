package ex_15_array;

import java.util.Scanner;

public class Lab156_enter_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("..................");
        for(int n:numbers){
            System.out.print(n +" ");
        }
    }
}
