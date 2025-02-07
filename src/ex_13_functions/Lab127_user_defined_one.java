package ex_13_functions;

public class Lab127_user_defined_one {
    public static void main(String[] args){
        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        //greet();

        //  2. Without Parameters but With Return Type
//        String s = greet_with_hello();
//        System.out.println(s);
//        int age_to_vote_person = age_to_vote();
//        System.out.println("Age to vote is -> " + age_to_vote_person);
//        greet_with_hello();


        //  3. With Parameters and Without Return Type ( 90%)
//        greet_with_name("Pramod");
//        greet_with_name("Dutta");
//        greet_with_name("Amit");

//        greet_with_full_name("Pramod ","Dutta");
//        greet_with_full_name("Tushar ","Kavle");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.next();
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        System.out.println("Enter your salary");
//
//        double salary = sc.nextDouble();
//
//        greet_with_details(name,age,salary);

     int sum = sum_of_two_num(3,5);
     int sum1 = sum_of_three_num(3,5,6);
     System.out.println(sum);
     System.out.println(sum1);
     int result = Math.max(4,7);
     age_to_vote();
     greet_with_full_details("bunty",19,38493894);
     greet_with_full_name("Bunty","Singh");
    }
    static int age_to_vote(){
        System.out.println("calculating age...");
        return 18;
    }
    static void greet(){
        System.out.println("Hi, how are you");
    }
    static String greet_with_hello(){
        return "Hello with greet";
    }
    static void greet_with_name(String name){
        System.out.println("Greet with name" +name);
    }
     static void greet_with_full_name(String firstName, String lastName){
        System.out.println("Full name "+firstName+ lastName);
     }
     static void greet_with_full_details(String name, int age, double salary){
        System.out.println("full details:" +name +"age is"+age + "and salary is"+salary);
     }
     //with parameter with return type
    static int sum_of_two_num(int a, int b){
        return a+b;
    }
    static int sum_of_three_num(int a, int b, int c){
        return a+b+c;
    }
}
