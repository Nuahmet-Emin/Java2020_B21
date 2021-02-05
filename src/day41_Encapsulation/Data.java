package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A"; // always reachable

    private static String privateVariable = "B";
    static String defaultVariable = "C";

     Data(){

    }

    public static void publicMethod(){
        System.out.println("Public Method");
    }

    private static void privateMethod(){
        System.out.println("Private Method");
    }

    static void defaultMethod(){
        System.out.println("Default Method");
    }




}
