package exception;

import java.awt.*;

public class Lab206_checked_java {
    public static void main(String[] args){
        System.out.println("I");
        try{
        int a = 10/0;
        System.out.println(a);}
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Own message");
        }
        System.out.println("You");


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.


        // FileInputStream fileInputStream = new FileInputStream("C://log.txt");
    }
}
