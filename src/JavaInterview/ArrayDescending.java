package JavaInterview;

import java.util.Arrays;

public class ArrayDescending {

    public static void main(String[] args) {
        int [] arr = {2,1,3 };
        System.out.println(Arrays.toString(sortAsc(arr)));
    }

    public static int[] sortAsc(int[] arr){

        //int [] arr = {2,1,3 };
        int temp = 0;
        for(int i=0; i<=arr.length-1; i++){ // {2,1,3 }

            for(int j=0; j<=arr.length-1; j++){ //{2,1,3}
                if(arr[i] < arr[j]){ // 2 < 2,1,3
                   temp = arr[i]; //
                    arr[i] = arr[j]; // 3
                    arr[j] = temp;
                }

            }
            System.out.println( Arrays.toString(arr) );
        }

        return arr;
    }
}
