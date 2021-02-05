package day38_Statics;

import javax.sound.midi.Soundbank;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS = "iOS", madeIn = "China";

    public void call(long phoneNumber){
        System.out.println("iPhone " + model + " is calling " + phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: " + brand );
        System.out.println("Operating System: " + OS);
        System.out.println("iPhone is made in communist: " + madeIn);
    }

    public String toString(){
        return "Brand: " + brand + ", Model: " + model + ", Color" + color + ", price: " + price +
                ", Operating System: " + OS;
    }

}
