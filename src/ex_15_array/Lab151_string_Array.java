package ex_15_array;

public class Lab151_string_Array {
    public static void main(String[] args){
        String[] names = {"Rahul", "Bunty", "Singh"};
        System.out.println(names.length);
        System.out.println(names[1]);
        String[] atb10x =new String[3];
        atb10x[0] = "Bunty";
        atb10x[1] = "Singh";
        atb10x[2] = "Laatsahab";
        for(int i=0 ; i<3 ; i++){
            System.out.println(atb10x[i]);
        }

    }
}
