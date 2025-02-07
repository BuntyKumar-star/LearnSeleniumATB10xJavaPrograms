package ex010_for_loop_basics;

public class Lab113_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if( i == 5){
                break;
            }
            System.out.println(i);

        }
    }
}
