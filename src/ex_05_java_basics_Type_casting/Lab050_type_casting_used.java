package ex_05_java_basics_Type_casting;

public class Lab050_type_casting_used {
    public static void main(String[] args){
        int course = 101;
        float GST = 18.45f;
        // int total_int = course+GST; //narrowing implicit
        int total_int = course+(int)GST;//narrow expicit
        float total = course+GST;//widening implicit
        float total2 = (float) course+GST;//widening explicit
        System.out.println(total_int);
        System.out.println(total);
        System.out.println(total2);


    }
}
