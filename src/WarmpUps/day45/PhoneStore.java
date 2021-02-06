package WarmpUps.day45;

public class PhoneStore {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("XR","US", 899);
        Samsung samsung = new Samsung("S4","Korea",799);
        Nokia nokia = new Nokia("W1","US",699);

        System.out.println(iphone);
        iphone.call(1299499499);

    }
}
