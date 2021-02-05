package day43_Inheritance.carTask;

public class Car {
    public String brand, model, color, madeIn;
    public int year, mileage;
    public double price;

    public static boolean hasEngine, hasWheel, hasTire;

    static{
        hasEngine = true;
        hasWheel = true;
        hasTire = true;
    }

    public void setInfo(String brand, String model, String color, String madeIn, int year, int mileage, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public void drive(){
        System.out.println("driving " +brand + " " + model );
    }

    public void park(){
        System.out.println("parking " +brand + " " + model );
    }

    public String toString(){
        return year + " " + brand + " "+ model + " " + color + ", " + mileage + ", $" + price;
    }
}
/*
Car Task:
        Car:
            brand, model, color, year, madeIn
            hasEngine, hasWheel, hasTires
            setInfo(),drive(), park(), toString


        Mercedess
            autoPilot(), auotoParking()
        CarMax
    2012 BMW X5 Red, 100000 miles, $20000

 */