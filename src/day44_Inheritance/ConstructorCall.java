package day44_Inheritance;

class A{

    public A(){
        System.out.println("A");
    }
}

class B extends A{
    // super(); defualt constructor is called implicitly
    public B(){

        System.out.println("B");
    }
}


public class ConstructorCall extends B{

    public ConstructorCall(){
        System.out.println("C");
    }
    public static void main(String[] args) {

        //new B();
        new ConstructorCall();


    }
}
