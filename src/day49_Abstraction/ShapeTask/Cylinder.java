package day49_Abstraction.ShapeTask;

public final   class Cylinder extends Shape implements Volume{
    public double r , d, h;
    public static double PI = 3.14;

    public Cylinder(double r, double h) {
        super("Cylinder");
        if(r<=0 && h<=0){
            throw new RuntimeException("No such cylinder with the radius and height of " + r + " " + h);
        }
        this.r = r;
       d = 2 * r;
        this.h = h;
    }

    @Override
    public double area() {
        return 2 * PI * r * (r +h);
    }

    @Override
    public double perimeter() {
        //return 2 * PI * r * h;
        return new Circle(r).perimeter() * h;
    }

    @Override
    public double volume() {
        //return PI * r *r * h;
        return new Circle(r).area() * h;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area= '" +df.format (area())+ '\'' +
                "perimeter= '" + df.format(perimeter())+'\''+
                ",volume= '" + df.format(volume())+ '\'' +
                '}';
    }
}
