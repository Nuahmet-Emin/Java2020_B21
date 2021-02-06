package day45_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println("Hello world");
        }catch (RuntimeException e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally: Closed");
        }

        System.out.println("Test Completed");


    }
}
