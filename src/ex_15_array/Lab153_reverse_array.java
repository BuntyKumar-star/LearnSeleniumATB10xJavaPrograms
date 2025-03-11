package ex_15_array;

import java.util.Arrays;

public class Lab153_reverse_array {
    public static void main(String[] args){
        int[] marks = {23, 24 , 54, 65, 35, 34, 23};
        for(int i=marks.length-1; i>0; i--){
            System.out.print(marks[i] +", ");
        }
        Arrays.sort(marks);
        System.out.println("Ascending order of array : ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +", ");
        }
        System.out.println("Descending order of array : ");
        for(int i=marks.length-1; i>0; i--){
            System.out.print(marks[i] +", ");
        }

    }
}
