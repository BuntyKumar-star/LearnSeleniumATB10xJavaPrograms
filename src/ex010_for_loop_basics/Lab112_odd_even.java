package ex010_for_loop_basics;

public class Lab112_odd_even {
    public static void main(String[] args) {

        //  - TO find the even numbers from 1 to 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even  -> " + i);
            } else {
                System.out.println("Odd -> " + i);
            }
        }

    }
}
