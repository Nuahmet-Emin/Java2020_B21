package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int[] scores = new int[5];

        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores)); // converts array to String

        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("===============================");

        for (int each : scores) {
            System.out.println(each );
        }

    }
}
