package day07_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 100;
       boolean isPositive = a > 0;
       boolean isNegative = a < 0;
        System.out.println(a);
        System.out.println(a+ " is positive number: " + isPositive);
        System.out.println(a+ " is negative number: " + isNegative);

        int b = -100 -20;
        System.out.println(b);

        int c = 10 - - 20;
        System.out.println(c);

        int d = -10 *  4;
        int e =  10 * -4;
        int f = -10 * -4;

        System.out.println("============================================");
        // pre-increamet
        int x = 100;
        ++x;  //101
        System.out.println(x);

        int y = 100;
        --y;
        System.out.println(y);

        int z = 100;
        System.out.println(--z); //99

        int x2 = 100;
        System.out.println(++x2);

        System.out.println("==========================");

        //post

        int a2 = 100;
        System.out.println(a2++); // 100
        System.out.println(a2);   // 101

        int b2 = 100;
        System.out.println(b2--); // 100
        System.out.println(b2);   //99





    }
}
