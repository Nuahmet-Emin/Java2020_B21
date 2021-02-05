package day26_Arrays;

import java.util.Arrays;

public class ArraysDescending {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 7, 2, 0};
        Arrays.sort(arr);
        Arrays.toString(arr); // finsh sorting in ascending order

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 5, 6, 7]
                                                   // 0  1  2  3  4  5

        int[] descending = new int[arr.length]; // [7 ,6 ,5, 2, 1, 0]

        /*
        int j=0;
        for(int i = arr.length-1; i>=0; i--){
          //  System.out.print(arr[i] + " ");
            descending[j] = arr[i];
            j++;
        }

         */

        for(int i= arr.length-1, j =0; i >= 0; i--, j++){
            descending[i] = arr[j];
        }

        System.out.println( Arrays.toString(descending));









    }
}
