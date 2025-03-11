package ex_15_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab152_max {
    public static void main(String[] args){
        int[] marks = {23, 54, 12, 67, 98, 34, 56, 67};
        // find out max number from the marks array
        //int temp = 0;
        int i =0;
        for (i = 0 ; i<marks.length ; i++){
                System.out.print(marks[i] +", ");
        }
        System.out.println(" ");
        Arrays.sort(marks);
        for (i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i] +", ");
        }
        System.out.println(" ");

        int max_output = give_max(marks);
        System.out.println("max number in array = "+ max_output);
        int min_output = give_min(marks);
        System.out.println("min number in array = "+ min_output);
//        int max = 0;
//        for ( i=0 ; i<marks.length ; i++){
//            if(marks[i] > max){
//                max = marks[i];
//            }
//        }
//        System.out.println(max);
//        int min = marks[0];
//        for ( i=0 ; i<marks.length ; i++){
//            if(marks[i] < min){
//                min = marks[i];
//            }
//        }
//        System.out.println(min);
    }
    static int give_max(int[] array){
        int max = array[0];
        for(int x=0; x<array.length; x++){
            if(max<array[x]){
                max = array[x];
            }
        }
        return max;
    }
    static int give_min(int[] array){
        int min = array[0];
        for(int x=0; x<array.length; x++){
            if(min > array[x]){
                min = array[x];
            }
        }
        return min;
    }
}
