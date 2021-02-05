package day43_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota( String model, String color, int year, int mileage, double price){
        setInfo("Toyota", model, color, "Japan", year, mileage, price);
    }

    public static boolean isAffordable, isImmortal;

    static{
        isAffordable = true;
        isImmortal = true;
    }


}
/*
Toyota
       variables: brand, model, color, madeIn, year, mileage, price
       methods: setInfo, drive, park, toString
            isAfordable, isImmortal
 */
