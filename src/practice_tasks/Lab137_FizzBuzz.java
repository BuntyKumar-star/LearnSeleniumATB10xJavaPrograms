package practice_tasks;

public class Lab137_FizzBuzz {
    public static void main(String[] args){
        int a = 1 ;
        for(a=1;a<=100;a++){
            if(a%3==0){
                System.out.println("Fizz");
            } else if (a%5==0) {
                System.out.println("Buzz");
            } else if (a%3==0 && a%5==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(a + " Number is not Fizz, Buzz, FizzBuzz");
            }
        }
    }
}
