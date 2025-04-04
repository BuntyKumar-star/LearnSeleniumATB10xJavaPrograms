package ex_18_oops_part2.Wrapper_class;

public class Lab194_Wrapper_conversion {
    public static void main(String[] args){
        String num = "10";
        int aaa = 10;
        //String /Wrapper conversion
        Integer a = Integer.parseInt(num);

        //String to primitive

        int a3 = Integer.parseInt(num);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer aa = Integer.valueOf("10");
        System.out.println(aa);

    }
}
