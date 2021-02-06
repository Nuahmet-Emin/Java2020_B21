package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day44_Inheritance.ShapeTask.Cube;
import day47_Abstraction.ShapeTask.Circle;
import day47_Abstraction.ShapeTask.Shape;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Cylinder;

public class ReferenceCasting {

    public static void main(String[] args) {

        //implicit casting: smaller to larger done automatically

        int a = 10;
        double b =a;

        //explicit casting: larger to smaller must be done manually

        double d = 10.5;
        int c = (int)d;


        System.out.println("-----------------------------");
        //upcasting: smaller reference type to larger reference type
        Circle circle = new Circle(3);
        Shape shape =(Shape)circle;

        WebDriver driver = new ChromeDriver();

        //down casting: larger reference type  to smaller
        Animal animal = new Dog("A","Husky",'M',12,"White","Small");
        //animal.bark();
        Dog dog = (Dog)animal;
        dog.bark();

        Animal animal2 = new Cat("A","Husky",'M',12,"White","Small");
        //((Cat)animal2).meow();
        ((Cat) animal2).meow();

        System.out.println("---------------------------------------");








    }
}
