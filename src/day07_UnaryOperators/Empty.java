package day07_UnaryOperators;

public class Empty {
    public static void main(String... arr) {
        System.out.println("5+2 = " + 3 +4);
        System.out.println("5+2 = " +( 3 +4));

        System.out.println("Result B" + (1)+(2));

        System.out.println("===========================");
        int ivar = 100;
        System.out.println(ivar);
        double dvar = 123;
        System.out.println(dvar);
        float fvar = 200;
        System.out.println(fvar);

        //ivar = fvar;
        fvar = ivar;
        dvar = fvar;
       // fvar = dvar;
        dvar = ivar;
       // ivar = dvar;


    long a = 30L;
    long b = (short)a;
        System.out.println(b);

    float a1 = 100.987_6543f;
    short b1 = (byte)a1;
    byte c = (byte)b1;
        System.out.println(c);

    int a2 = 3, b2 = 2;
    long c2 = (a2 + b2)*2/3 %2;
    //          3 %2 ==1
        System.out.println(c2);



     long a3 = 3_000L;
     double b3 = (float)a3;
     int c3 = (short) b3;
        System.out.println(c3 %1000);

        System.out.println((int)(10.0/3));
    }
}

