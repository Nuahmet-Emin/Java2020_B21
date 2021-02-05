package day31_MethodOverLoading;

public class MethodOverloadingIntro {

    public static void main(String[] args) {
        method();
        method(1);
    }

    public static void method(){
        System.out.println("A");
    }

    public static void method(int a){
        System.out.println("B");
    }

    public static void method(String b){
        System.out.println("C");
    }

    public static void method(int a, String b){
        System.out.println("D");
    }

    public static void method(double e){
        System.out.println("E");
    }

}


