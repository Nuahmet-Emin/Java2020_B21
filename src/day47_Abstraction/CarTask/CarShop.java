package day47_Abstraction.CarTask;

public class CarShop {
    public static void main(String[] args) {

    //Car car = new Car("Brand","Car1","White",2020,30000 );
        Mercedes mercedes = new Mercedes("G Class","Red",2019,45000);
        Toyota toyota = new Toyota("Camry","White",2014,30000);
        BMW bmw = new BMW("X5","White",2020, 40000  );
        Tesla tesla = new Tesla("X","Blue",2020, 70000  );

        System.out.println("Start Mercedes- " );
        mercedes.start();

        System.out.println("Start Toyota- " );
        toyota.start();

        System.out.println("Start Tesla- " );
        tesla.start();

        System.out.println("Start BMW- " );
        bmw.start();

    }
}
