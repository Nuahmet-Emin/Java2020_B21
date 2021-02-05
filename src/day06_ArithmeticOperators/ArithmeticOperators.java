package day06_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /*
        Integer * integer ==> int
        decimal * integer ==> double
        decimal * decimal ==> double

        integer / integer ==> int
        `10 / 3 ============> 3

        decimal / integer ==> double
        10.0 / 3 =============3.333...

        integer / decimal ==> double
         10 / 3.0 ==> 3.333....

         decimal / decimal ==> double
         10.0 / 3.0 ==> 3.3.....
         */
        System.out.println(10/4); // 2
        System.out.println("10/4"); // text "10/4"

        System.out.println(12 + 3.0); // 15.0

        System.out.println("12" + 3); // "123"

        System.out.println('a' + 3); // addition
        //                  97 + 3

        System.out.println(12.0 -4); // 8.0

        double a = 12.0 / 3 ; // 4.0
        System.out.println(a);

        int b = 10/3;
        System.out.println(b); // 3

        double c = 10/3; // 3.0
        System.out.println(c);

        double d = 10 / 3.0; // 3.33333...
        System.out.println(d);

        int x = 3/2; // 1
        System.out.println(x);

        double y = 3/2; // 1.0
        System.out.println(y);

        double z = 3/2.0; // 1.5
        System.out.println(z);

        System.out.println("=====================================");

        // remainder: numerator cannot be evenly divided by the denominator, %
        // remainder = numerator - (denominator * whole number of the result)
        /* 10.0 / 3 = 3.33333
        remainder: 10 - (3*3) = 1
         */


        /*
        20.0 / 4 = 5.0;
        20 -(4*5) = 0
        20 % 4 ==> 0
         */

        /*
        30.0 / 7 = 4.2222...
        remainder = 30 - (7 * 4) = 2
         */

        System.out.println( 100 % 13);
        System.out.println(100 % 10);

        System.out.println(20% 4.5);


    }
}
