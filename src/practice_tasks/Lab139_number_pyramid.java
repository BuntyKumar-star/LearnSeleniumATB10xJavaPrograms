package practice_tasks;

public class Lab139_number_pyramid {
    public static void main(String[] args){
        int row = 5 ;
        for (int i = 1 ; i <= row ;i++){
            for(int j = i ;j < row ; j++) {
                System.out.print(" ");
            }
            for(int x = 1 ; x <= 2*i-1 ; x++ ){
                System.out.print(x);
            }
            System.out.println();

        }

    }
}
