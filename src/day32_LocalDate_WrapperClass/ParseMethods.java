package day32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {

        String data1 = "123";

        System.out.println(data1 + 3);

        int num1 = Integer.parseInt(data1); // not auto or unboxing
        //          primitive <== primitive int

        Integer num2 = Integer.parseInt(data1); // Autoboxing
        //        Wrapper class <== primitive

        System.out.println(num1 + 3);

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1);

        //System.out.println(num3);

        String s2 = "2.5";
        double d1 = Double.parseDouble(s2); // returns primitives
        // primitive <== primitive
        Double d2 = Double.parseDouble(s2); // autoboxing
        // wrapper class <== primitive

        System.out.println(d1+1);

        String s3 = "true";
        boolean r1 = Boolean.parseBoolean(s3); // none boxing
        Boolean r2 = Boolean.parseBoolean(s3); // auto boxing

        System.out.println(r1); // default value of boolean is false

        String s4 = "TRue";

        boolean r3= Boolean.parseBoolean(s4); // not case sensitive
        System.out.println(r3 );


    }
}
