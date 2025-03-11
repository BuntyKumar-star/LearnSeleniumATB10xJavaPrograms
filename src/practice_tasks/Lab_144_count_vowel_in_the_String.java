package practice_tasks;

import java.util.Scanner;

public class Lab_144_count_vowel_in_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int count = 0;
        str = str.toLowerCase();
        System.out.println(str);
        for (int i=0 ; i <str.length();i++){
            char ch = str.charAt(i);
            if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels in the " +str+ "= "+ count );
    }
}
