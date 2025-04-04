package static_keyword;

public class Lab185_static1 {
    public static void main(String[] args){
        ATB a1 = new ATB(89543243, "Singh");
        System.out.println(a1.phone_num);
        System.out.println(a1.name);
        a1.course_name = "ATB10x";
        System.out.println(a1.course_name);
        System.out.println(ATB.course_name);
        a1.display();
        ATB.m1();
    }
}

class ATB {
    static String course_name = "ATB";
    int phone_num;
    String name;

    public ATB(int phone_num1, String nam) {
        this.phone_num = phone_num1;
        this.name = nam;
        System.out.println("constructor with static " + course_name);
    }

    void display() {
        System.out.println(this.phone_num + this.name + course_name);
    }

    static void m1(){
        System.out.println("mark attendence");
    }
}
