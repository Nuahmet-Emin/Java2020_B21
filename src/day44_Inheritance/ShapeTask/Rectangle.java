package day44_Inheritance.ShapeTask;

import day44_Inheritance.ShapeTask.Shape;

public class Rectangle extends Shape {
    /*
       variables: 4(1 ins, 3 sta)
       methods: 4 (4 ins)
     */
    public double length, width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;


    }
    @Override
    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return (length + width) * 2;
    }


}
