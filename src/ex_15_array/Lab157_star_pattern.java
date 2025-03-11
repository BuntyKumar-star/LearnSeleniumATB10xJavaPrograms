package ex_15_array;

import java.util.Scanner;

public class Lab157_star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int num = sc.nextInt();
        int[][] matrix = new int[num][num];
        for(int i=0 ;i<= matrix.length;i++){
            for(int j=0; j<i ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
