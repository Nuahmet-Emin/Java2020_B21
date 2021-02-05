package day43_Inheritance.carTask;

public class BMW extends Car {

    public BMW(String model, String color, int year, int mileage, double price){
        setInfo("BMW", model, color, "Germany", year, mileage, price);
    }

    public static boolean isExpensive, isLuxury, breaksALot;

    static{
        isExpensive = true;
        isLuxury = true;
        breaksALot = true;
    }

    public void race(){
        System.out.println(brand + " " + model + " is racing");
    }
}
/*
BMW
 variables: brand, model, color, madeIn, year, mileage, price
       methods: setInfo, drive, park, toString
            isExpensive, isLuxury
            race()
 */
