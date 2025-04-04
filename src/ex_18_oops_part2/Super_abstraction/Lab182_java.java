package ex_18_oops_part2.Super_abstraction;

public class Lab182_java {
    public static void main(String[] args){
        Singh s2 = new Singh();
        s2.display();
        System.out.println(s2.a);
        bunty b1 = new Singh();//Dynamic dispatch
        b1.display();
        System.out.println(b1.a);


    }
}

class Singh implements bunty{
    public void display(){
        System.out.println("display " +a);
    }
}


interface bunty{
    public int a=10;
    void display();
}
