package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = max(array);

        System.out.println("Max = " + max);

        int min = min(array);

        System.out.println("Min = " + min);

        System.out.println(min < -2);
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }


}
