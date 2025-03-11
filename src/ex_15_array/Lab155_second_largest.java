package ex_15_array;

import java.util.Arrays;

public class Lab155_second_largest {
    public static void main(String[] args){
        int[] numbers = {23, 24, 35, 12, 67, 87,32};
        Arrays.sort(numbers);
        for(int n:numbers){
            System.out.print(n +" ");
        }
        System.out.println(" ");
        System.out.println("Second largest number: " +numbers[numbers.length-2]);

    }
}
