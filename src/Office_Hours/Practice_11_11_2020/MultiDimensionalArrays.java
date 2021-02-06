package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3,4};

        int[][] arr2D = {{1,2,3,4}, {5,6,7}, {8,9}};

        System.out.println(arr2D[2] );
        System.out.println(Arrays.toString(arr2D[2]));

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("==========================");

        for(int[] each1DArray: arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for(int each : each1DArray){
                System.out.println(each);
            }
        }

        System.out.println("=============================");

        for(int[] arr1DArray: arr2D){
            for(int each : arr1DArray){
                if(each % 2 == 0){
                    System.out.println(each);
                }
            }
        }



    }
}
