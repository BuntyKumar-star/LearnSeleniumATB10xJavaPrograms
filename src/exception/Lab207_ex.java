package exception;

public class Lab207_ex {
    public static void main(String[] args){
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");

    }
}
