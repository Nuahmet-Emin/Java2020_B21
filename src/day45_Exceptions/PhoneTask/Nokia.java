package day45_Exceptions.PhoneTask;

public final class Nokia extends Phone {

    public Nokia( String model, double price) {
        super("Nokia", model, "USA", price);
    }

    public void selfDefense(){
        System.out.println(brand + " " + model + " is for self defense");
    }

    public void breakFloor(){
        System.out.println(brand + " " + model + " can break floor");
    }
}
