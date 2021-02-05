package day38_Statics;

public class IphoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();

        Iphone iphone2 = new Iphone();
        Iphone iphone3 = new Iphone();
        Iphone iphone4 = new Iphone();

        //iphone1.OS = "Anroid"; // will change OS for all

        System.out.println(iphone1.OS);

        System.out.println("========================");

        Iphone.getInfo();



    }
}
