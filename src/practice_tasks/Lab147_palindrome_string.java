package practice_tasks;

import java.util.Scanner;

public class Lab147_palindrome_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome :");
        String str = sc.nextLine();
        int count=0;

        for (int i=0 ; i<str.length() ; i++){
            if (str.charAt(i)!=str.charAt((str.length()-1-i))){
                count++;
            }
        }
        if(count==0) {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
