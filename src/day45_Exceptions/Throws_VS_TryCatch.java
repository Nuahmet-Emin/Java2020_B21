package day45_Exceptions;

import library.BrowserUtility;

public class Throws_VS_TryCatch {

    public static void main(String[] args) {
        method1();
        System.out.println("Try Catch");

        //method2();

        BrowserUtility.sleep(3);
        System.out.println("Test Completed");
    }

    public static void method1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws InterruptedException {
        Thread.sleep(3000);
    }



}
