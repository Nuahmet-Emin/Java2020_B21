package WarmpUps.day45;

public class Phone extends Device {

    public Phone(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }

    public void call(long number){
        System.out.println(brand + " " + model + " is calling " + number);
    }

    public void text(long number){
        System.out.println(brand + " " + model + " is texting " + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", price= $" + price +
                '}';
    }
}
