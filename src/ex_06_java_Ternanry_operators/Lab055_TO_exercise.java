package ex_06_java_Ternanry_operators;

public class Lab055_TO_exercise {
    public static void main(String[] args){
        //Find the maximum number among 3 numbers
        int x = 15;
        int y = 10;
        int z = 20;
        String result = x > y ? (x>z ? "x=15 is the max" : "z=20 is max") : (y>z ? "y=10 is max" : "z=20 is max");
        System.out.println(result);

    }
}
