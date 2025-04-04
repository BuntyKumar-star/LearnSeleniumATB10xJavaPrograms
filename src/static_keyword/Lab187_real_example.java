package static_keyword;

public class Lab187_real_example {
    public static void main(String[] args){
        ATB1 s3 = new ATB1();
        s3.doAssignment();
        System.out.println(ATB1.course_name);
        s3.setName("Singh");
        System.out.println(s3.getName());
        s3.setPhone_num("848240200294");
        System.out.println(s3.getPhone_num());
        s3.readDocument();

    }
}
class ATB1{
    {
        System.out.println("IIB , this is called when object is created");

        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }
    public ATB1(){
        System.out.println("constructor");
    }

    static{
        System.out.println("load the class, i will execute");
    }
        private String name; //non static
        private String phone_num;
        static String course_name  = "ATB10x";
        public String getName(){
            return name;
        }
        public void setName(String name1){
            this.name = name1;
        }
        public String getPhone_num(){
            return phone_num;
        }
        public void setPhone_num(String phn_num){
            this.phone_num = phn_num;
        }
        void readDocument(){
            System.out.println("Non static method");
            System.out.println(course_name);
        }
        static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }
}
