package static_keyword;

public class Lab184_student {
    public static void main(String[] args){
        Student s1 = new Student(86);
        System.out.println(s1.age);
        s1.m2();
        Student.m2();
        System.out.println(s1.courrse_name);
        System.out.println(Student.courrse_name);
    }

}
class Student{
    int age;//non static
    static String courrse_name = "ATB";
    public Student(int age_c) {
        this.age = age_c;
        System.out.println(this.courrse_name);
    }
    static void m2(){
        System.out.println("I am static method");
    }
}
