package day49_Abstraction.ShapeTask;

public final class Circle extends Shape {
    private double r;
    private double d;
    public final static double PI = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        d = 2*r;
    }

    public Circle(double r) {
        super("Circle");
        if(r<=0){
            throw new RuntimeException("No such circle with radius of " + r);
        }
        setR(r);
       setD(d);
    }

    @Override
    public double area(){
        return PI * r * r;
    }

    @Override
    public double perimeter(){
        return 2* PI * r;
    }
}
