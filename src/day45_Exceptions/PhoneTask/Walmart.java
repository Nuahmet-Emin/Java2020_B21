package day45_Exceptions.PhoneTask;

public class Walmart {
    public static void main(String[] args) {
        long number = 911;
        Iphone iphone = new Iphone("12 Pro Max",1300);
        Samsung samsung = new Samsung("S20", 1200);
        Nokia nokia = new Nokia("Brick", 70);

        iphone.call(number);
        samsung.call(number);
        nokia.call(number);

        iphone.faceTime(number);

        samsung.freeze();

        nokia.selfDefense();




    }
}
