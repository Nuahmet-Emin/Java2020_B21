package day46_JavaRecap.ShapeTask;

public class Shape {
    public String name;

    public Shape(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Shape name cannot be empty");
        }

        for(int i=0; i<=name.length()-1; i++){
            char eachChar = name.charAt(i);
            if(!Character.isLetter(eachChar)){
                throw new RuntimeException("No such a Shape");
            }
        }

        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", Area= " + area() +
                ", Perimeter= " + perimeter() +
                '}';
    }
}
/*
Shape Task:
        1. create a class called Shape:
                Attributes: name
                add a constuctor that can set the name of the shape:
                        if shape' name is set to be empty, throw an exception with a message of: "Shape Name cannot be empty"
                        if name contains a character that is not letter, throw an exception with a message of: "No such a Shape"

                methods:
                    area(): returns the area of the shape
                    perimeter(): returns the perimeter of the shape
                    toString(): prints the shape' Name, Area and Perimeter

        3. create a class called Rectangle:
                Attributes: name, l, w
                Add a constructor that can set the instances of the Rectangle:
                        if the length or width of the rectangle is 0 or negative, throw an exception with a message of: "No Such a Rectangle with a length and width of: l & w "  replace l & w with given length and width
                methods:
                    area(): returns the area of the rectangle
                    perimeter(): returns the perimeter of the rectangle

 */
