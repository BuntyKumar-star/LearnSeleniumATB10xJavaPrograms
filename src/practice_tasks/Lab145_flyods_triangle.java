package practice_tasks;

import java.util.Scanner;

public class Lab145_flyods_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        for (int i=1 ;i<=row ; i++){
            for (int j=1;j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
