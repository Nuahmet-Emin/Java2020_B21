package day43_Inheritance.carTask;

public class CarMax {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue",2019,200001, 10000);

        BMW bmw = new BMW("X5", "Red", 2018, 15000, 50000);

        System.out.println(toyota);
        System.out.println(bmw);

        System.out.println(BMW.isLuxury);
        System.out.println(BMW.isExpensive);

        System.out.println(Toyota.isAffordable);
        System.out.println(Toyota.isImmortal);


    }
}
