package day49_Abstraction.ShapeTask;

public final class Rectangle extends Shape{
    public double w, l;

    public Rectangle(double w, double l) {
        super("Rectangle");
        if(w <=0 && l <=0){
            throw new RuntimeException("No such rectangle with the width and length of " + w + " " + l);
        }
        this.w = w;
        this.l = l;
    }

    @Override
    public double area() {
        return w * l;
    }

    @Override
    public double perimeter() {
        return 2 * (w + l);
    }
}
