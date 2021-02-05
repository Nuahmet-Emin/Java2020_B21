package day49_Abstraction.ShapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10,20);
        Cube cube = new Cube(10);
        Cylinder cylinder = new Cylinder(2,5);
        Square square = new Square(50);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(square);


        System.out.println("---------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //list.forEach(p -> { if(p%2 == 0) System.out.println(p);});
        list.forEach(p -> { if(p%2 == 0) p *=2;  });
        System.out.println(list);

        System.out.println("---------------------------------");
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.forEach( p-> { if(p % 2 == 0) evenNumbers.add(p); else oddNumber.add(p); });

        numbers.forEach(p -> { if(p > 5) greaterThan5.add(p); });

        System.out.println("oddNumbers: " + oddNumber);
        System.out.println("EvenNumbers: " + evenNumbers);
        System.out.println("GreaterThan5 " + greaterThan5);


    }
}
