package ex_15_array;

public class Lab150_java {
    public static void main(String[] args){
        int[] marks1 = {1,3,5,8,9};
        int[] marks2 = new  int[5];
        System.out.println(marks1.length);
        System.out.println(marks2.length);
        String s1 = "Bunty";
        System.out.println(s1.length());
        marks2[0] = 91;
        marks2[1] = 54;
        marks2[2] = 45;
        marks2[3] = 34;
        marks2[4] = 56;
        //marks2[5] = 57;
        for(int i=0;i<5;i++){
            System.out.println(marks2[i]);
        }
    }
}
