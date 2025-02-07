package practice_tasks;

public class Lab138_pyramid_pattern {
    public static void main(String[] args){
        /*       *
                ***
               *****
              *******
             *********
         */
        int i = 1;
        for ( ;i<=9;i++){
            for (int j=i ; j<9 ; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
