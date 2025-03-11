package ex_15_array;

public class Lab154_sum_of_array {
    public static void main(String[] args){
        int[] numbers = {12, 23, 54, 64, 23};
        int sum=0;
//        for(int i=0; i<numbers.length; i++){
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);
        for(int n: numbers){
            sum = sum + n;
        }
        System.out.println(sum);

    }
}
