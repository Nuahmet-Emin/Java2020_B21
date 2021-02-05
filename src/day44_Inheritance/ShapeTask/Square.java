package day44_Inheritance.ShapeTask;

import day44_Inheritance.ShapeTask.Shape;

public class Square extends Shape {
    /*
       variables: 4(1 ins, 3 sta)
       methods: 4 (4 ins)
     */
    public double side;

    public Square(double side){
        super("Square");
        this.side = side;

    }

    public double calcArea(){
        return side * side;
    }

    public double calcPerimeter(){
        return 4 * side;
    }
}
