package day48_Abstraction;

public interface InterfaceRules {
  int a = 100; //static by default

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);

        // a = 100; by default it's final
    }
    void method2();

    public default void m(){

    }
}
/*
Interface: Cannot have objects
What we can have:
    variables : public static and final by default
    methods: abstract methods
             static methods
             default method


What we cannot have:
    constructor
    instance methods
    instance variable
 */