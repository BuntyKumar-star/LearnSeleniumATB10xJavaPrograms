package practice_tasks;

public class ex_07_19th_tasks {
    /*
    Challenge ; ✅ Grade Calculator:

Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
     */
    public static void main(String[] args){
        int marks = 40;
        String result = marks >= 90 ? "Grade A" : (marks >= 80 ? "Grade B" : (marks >= 70 ? "Grade C" :(marks >= 60 ? "Grade D" :(marks >= 0 ? "Grade F" :"No Grade")) ));
        System.out.println(result);
    }
}
