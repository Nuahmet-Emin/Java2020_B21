package day40_Constructor;

public class ConstructorCall {



 /* need to use this keyword to call constructor, referst to the object instances
       this. : to call instance variables or methods
       this() : to call Constructor, constructor call is priority need to be call first


 Constructor Call:
            1. only a constructor can call another constructor
            2.constructor can be overloaded, the only wat to have more that one constructor in class
            3.constructor cannot be called by constructor name, we need this()
            4.constructor call must be in the first STEP
            5.one constructor can Only call one constructor
            6.Constructor cannot call or contain itself

  */
 public ConstructorCall(){
     System.out.println("Default Constructor");
 }

    public ConstructorCall(int a){
        //ConstructorCall();
        this();
        System.out.println("Constructor with int arg");
    }

    public ConstructorCall(String str){
        this(10); //default, int
        // this(); // one constructor can Only call one constructor
        System.out.println("Constructor with String arg");
    }


    public static void main(String[] args) {

     ConstructorCall obj1 = new ConstructorCall("A");

    }




    public void method4(){
        //  ConstructorCall();
    }

    public static void method1(){
        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }

    public static void method3(){
        method1();
        method2();
        System.out.println("Method3");
    }
}
