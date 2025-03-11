package ex_17_Oops_constructor;

import java.util.Scanner;

public class Lab162_cars2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model name");
        String model_name = sc.next();
        Cars2 tesla = new Cars2();
        System.out.println(tesla.name);
        Cars2 audi = new Cars2("Audi123", 2025);
        System.out.println(audi.name);
        System.out.println(audi.year);
        Cars2 nano = new Cars2("Tata Nano", 2015);
        System.out.println(nano.name);
        System.out.println(nano.year);
    }
}
