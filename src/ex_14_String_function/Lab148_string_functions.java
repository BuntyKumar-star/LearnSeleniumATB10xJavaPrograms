package ex_14_String_function;

public class Lab148_string_functions {
    public static void main(String[] args){
        String name = "Sonal";
        System.out.println(name);
        System.out.println(name.length());
        //1. charAt()
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(10)); exception out of bound index error
        //2. concat()
        System.out.println(name.concat("singh"));
        //3. contains()
        System.out.println(name.contains("on"));
        //4. equals()
        System.out.println(name.equals("Sonal"));
        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sONAL"));
        //6. indexOf()
        System.out.println(name.indexOf('o'));
        //7. replace()
        System.out.println(name.replace('o','u'));
        //8. split()
         String name3 = "buntysingh1948@gmail.com";
         String[] split = name.split("@");
        System.out.println(split[0]);
        System.out.println(name.split("@"));
        //System.out.println(split[2]);
        //9. substring()
        System.out.println(name.substring(1,3));
        String ss = "hamnurger";
        System.out.println(ss.substring(4,9));
        //10. toLowerCase()
        System.out.println(name.toLowerCase());
        //11. toUppperCase()
        System.out.println(name.toUpperCase());
        //12. startsWith()
        System.out.println(name.startsWith("s"));
        //13. endsWith()
        System.out.println(name.endsWith("l"));
        //14. trim()
        String s3 = "Sonal Harry";
        System.out.println(s3.trim());
        //15. compareTo()
        System.out.println(name.compareTo("Sonal"));
        //16. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("sONAL"));
        //17.String builder > save memory by modifying existing string
        StringBuilder stringBuilder = new StringBuilder("Bunty");
        stringBuilder.append("Singh");
        System.out.println(stringBuilder);

    }
}
