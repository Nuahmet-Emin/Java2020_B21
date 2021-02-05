package day29_Methods;

import java.util.Arrays;

public class VoidMethodPractice {

    public static void main(String[] args) {
        int[] a1 = {100,200,-300,1,2,50,40};

        arrayMaxNum(a1);


    }
    public static void arrayMaxNum(int[] arr){
        /*
        Arrays.sort(arr);
        System.out.println("Maximum number: " + arr[arr.length-1]);

         */

        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        System.out.println("Maximum number is: " + max);
    }


}
/*
1. create a function that can print out the maximum number from any given integer array
2. create a function that can print out the minimum number from any given integer array
3. create a function that can print the unique elements from the array

 */
