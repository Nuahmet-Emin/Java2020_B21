package day07_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        double d2 = 300;
        float f1 = (float) d2; // holdng Alt + hit enter using keyboard
                               // for Mac: holding Option + hit enter

        long l2 = 300; // implicit casting
                       // 300L
        int i2 = (int) l2;
                       // 300

        System.out.println("===================================");
        // implicit casting: casting smaller type to larger type
        // explicit casting: casting larger type to smaller type

        short s2 = 400;
        byte b1 = (byte)s2; // -128 <= byte <= 127
        System.out.println(b1);

        long l3 = 100;
        byte b2 = (byte) l3;
        System.out.println(b2);





    }
}
