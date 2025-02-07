package practice_tasks;

public class Lab142_prime_number {
    public static void main(String[] args){
        //Prime number 1,2,3,5,7,11,13,17,19,23
        int n = 100;
        for(int i=1;i<=100;i++){
            if(i%2==0 || i%3==0){
                continue;
            }
            else{
                System.out.print(i+",");
            }
        }
    }
}
