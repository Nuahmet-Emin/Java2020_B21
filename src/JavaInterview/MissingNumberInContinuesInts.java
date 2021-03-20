package JavaInterview;

import java.util.Arrays;

public class MissingNumberInContinuesInts {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};

        System.out.println("missingNum2(arr) = " + missingNum2(arr));

        System.out.println("missingNum3(arr) = " + missingNum3(arr));

    }

    public static int missingNum(int[] arr) {

        int res = 0;

        Arrays.sort(arr);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i <= arr.length - 1; i++) {
            if ((arr[i] - arr1[i]) != 0) {
                res = arr1[i];
                break;
            }
        }
        return res;
    }

    public static int missingNum2(int[] arr) {
        int res = 0;
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 1 ; i--) {
            if ((arr[i] - arr[i-1]) != 1) {
                res = arr[i] -1;
                break;
            }

        }
        return res;
    }

    public static int missingNum3(int[] arr) {
        int res = 0;
        Arrays.sort(arr);

        for (int i = 1; i <=arr.length-1 ; i++) {
            if ((arr[i] - arr[i-1]) != 1) {
                res = arr[i] -1;
                break;
            }

        }
        return res;
    }
}
