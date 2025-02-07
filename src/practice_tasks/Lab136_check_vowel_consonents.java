package practice_tasks;

import java.util.Scanner;

public class Lab136_check_vowel_consonents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of char");
        char c = sc.next().charAt(0);
        c = Character.toLowerCase(c);
        switch(c){
            case 'a' :
                System.out.println(c + "is a vowel");
                break;
            case 'e' :
                System.out.println(c + "is a vowel");
                break;
            case 'i' :
                System.out.println(c + "is a vowel");
                break;
            case 'o' :
                System.out.println(c + "is a vowel");
                break;
            case 'u' :
                System.out.println(c + "is a vowel");
                break;
            default:
                if(Character.isLetter(c)){
                    System.out.println(c + "is a consonant");
                    break;
                }
                else{
                    System.out.println(c + " is not a letter");
                    break;
                }



        }
    }

}
