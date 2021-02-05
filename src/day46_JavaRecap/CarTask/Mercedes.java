package day46_JavaRecap.CarTask;

public final class Mercedes extends Car {
    public Mercedes( String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }
    @Override
    public void start(){
        System.out.println("Starting " + brand + " " + model + " by pushing start button");
    }


}
/*
2. create the following sub classes of Car:
                        1. Mercedes
                        2. BMW   // AutoPark
                        3. Lexus
                        4. Tesla  // AutoPilot
                    Make sure those class cannot be inherited
                    each sub class should have constructor with 4 arguments: Model, Color, Year, Price
 */
