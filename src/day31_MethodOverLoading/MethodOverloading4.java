package day31_MethodOverLoading;

import library.ArrayUtility;

import java.util.Arrays;

public class MethodOverloading4 {

    public static void main(String[] args) {

        int[] arr = {1,20,2,45,15};
       arr= sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ArrayUtility.printArray(arr));

        double [] arr2 = {1.3, 100.5,3.5,-9.8 };
        arr2=sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sort(arr2)));

        char[] arr3 = {'a','d','c','f','b'};
        arr3 = sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] sort(int[] arr) { //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        int[] reversedArray = new int[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    public static double[] sort(double[] arr) {
        Arrays.sort(arr);
        double[] reversedArray = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    public static char[] sort(char[] arr) {
        Arrays.sort(arr);
        char[] reversedArray = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    public static String[] sort(String[] arr){
        Arrays.sort(arr);
        String[] reversedArray = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

}


