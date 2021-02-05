package day35_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Toyota";
        car2.brand = "BMW";
        car3.brand = "Lexus";
        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);

        car1.model = "Corolla";
        car2.model = "i8";
        car3.model = "RX";

    }


}
