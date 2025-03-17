package ex_18_oops_part2.Super;

public class Lab172_super_example {
    public static void main(String[] args){
        Testcase1 t1 = new Testcase1("Chrome");
//        BaseClass t1 = new BaseClass("Chrome");
        System.out.println(t1.getBrowser());
        t1.setBrowser("Edge", true);
        System.out.println(t1.getBrowser());
        t1.openBroser();
        t1.openBroser("Firefox");
        t1.closeBrowser();

    }
}

class BaseClass{
    private String browser ;
    public BaseClass(String browser){
        this.browser = browser;
    }
    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browser, boolean IsAdmin){
        if(IsAdmin){
            this.browser = browser;
        }
        else{
            System.out.println("Not Allowed");
        }
    }

    void openBroser(){
        System.out.println("Opening broser");
    }
    void openBroser(String browser){
        System.out.println("Opening Broser" +browser);
    }

    void closeBrowser(){
        System.out.println("Clsoing Browser");
    }
}

class Testcase1 extends BaseClass{
    public Testcase1(String browser){
        super(browser);
    }

    @Override
    public void setBrowser(String browser, boolean IsAdmin) {
        super.setBrowser(browser, IsAdmin);
    }

//    public void setBrowser(String browser, boolean IsAdmin){
//        System.out.println("Over ride the parent setbrowser");
//        if(IsAdmin){
//            super(browser) = browser; //not workout
//        }
//        else{
//            System.out.println("Not allowed to change over");
//        }
//    }
}
