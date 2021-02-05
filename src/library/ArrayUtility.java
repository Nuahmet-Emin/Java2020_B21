package library;

import java.util.Arrays;

public class ArrayUtility {

    // returns max number from an integer array
    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    // returns min number from an integer array
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    // returns max number from an double array
    public static double max(double[] arr){
        double max = arr[0];

        for(double each : arr){
            if(each > max){
                max = each;
            }
        }


        return max;
    }

    // returns min number from a double array
    public static double min(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    // combines given two int arrays to a new integer arrays
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index numbs of arr3

        for (int each : arr1) {
            arr3[i++] = each;
        }
        //i=2
        for (int each : arr2) {
            arr3[i++] = each;
        }
        return arr3;
    }

    // combines given two double arrays to a new double arrays
    public static double[] combineTwoArrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0; // represents the index numbs of arr3

        for (double each : arr1) {
            arr3[i++] = each;
        }
        //i=2
        for (double each : arr2) {
            arr3[i++] = each;
        }
        return arr3;
    }

    // combines given two char arrays to a new double arrays
    public static char[] combineTwoArrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0; // represents the index numbs of arr3

        for (char each : arr1) {
            arr3[i++] = each;
        }
        //i=2
        for (char each : arr2) {
            arr3[i++] = each;
        }
        return arr3;
    }

    // combines given two String arrays to a new double arrays
    public static String[] combineTwoArrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0; // represents the index numbs of arr3

        for (String each : arr1) {
            arr3[i++] = each;
        }
        //i=2
        for (String each : arr2) {
            arr3[i++] = each;
        }
        return arr3;
    }




    // sorts an integer array in descending order
    public static int[] sort(int[] arr) { //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        int[] reversedArray = new int[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // sorts an double array in descending order
    public static double[] sort(double[] arr) {
        Arrays.sort(arr);
        double[] reversedArray = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // sorts an double array in descending order
    public static char[] sort(char[] arr) {
        Arrays.sort(arr);
        char[] reversedArray = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // sorts an double array in descending order
    public static String[] sort(String[] arr){
        Arrays.sort(arr);
        String[] reversedArray = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }


    //replaces the [ with { while printing the array
    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str =str.replace("[","{").replace("]","}");
        return str;
    }



}
