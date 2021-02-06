package TestNQuiz.UnitTest2;

import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {


        double[] doub = new double[4];

        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4];
        doub[1] = 17.2;
        doub[3] = doub.length;

        System.out.println(Arrays.toString(doub));

        //Q25

        /*
        a = 5
        b =
         */


        //Q26.

        byte [] b = new byte[5];

        for(int j=0; j<b.length; j++){
            b[j] = (byte)(b[j] *2);
        }


        System.out.println(b);

    }
}
