package practice_tasks;

public class Lab141_fibnonacci_series {
    public static void main(String[] args){
        //Print fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21
        int n = 10;
        int first = 0, second = 1;
            System.out.print(first+","+second);
            for (int i=2; i<10;i++){
                int next = first+second;
                System.out.print(","+next);
                first = second;
                second = next;
            }
    }
}
