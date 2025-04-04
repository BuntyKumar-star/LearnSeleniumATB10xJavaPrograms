package static_keyword;

public class Lab186_static_SIB {
    public static void main(String[] args){
     A s2 = new A();
     System.out.println(s2.a);
     A.m3();


    }
}

class A{
    static{
        System.out.println("Called only once when class is loaded");
        System.out.println("you can write code reading excel file , database file");
    }
    static int a ;
    static void m3(){
        System.out.println("static function");
    }
    // Static class is not useful

        }
