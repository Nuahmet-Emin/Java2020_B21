package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2};

        int[] arr2 = {3,4,5,6,7};

        int[] arr3 = {8,9,10,11,12,13};

        int[][] arrays = {arr1, arr2,arr3};

        System.out.println(arrays[1][3]);

        //retrieve the element 8
        System.out.println(arrays[2][0]);

        // {3,4,5,6,7)gx
        System.out.println(Arrays.toString(arrays[1]));
        System.out.println(Arrays.deepToString(arrays));

        System.out.println("================================");

        String[][] batch21 = {{"Lily", "Lana", "Igor"},
                {"Polina","Serhii","Abudujilil","Aziz", "Halzat"},
                {"Justyna","Adil","Ercan","Irina","Med","Olesea","Vlad","Asum","Guvach"}
        };

        for(int i=0; i<=batch21.length-1; i++){
            String[] eachGroup = batch21[i];
            System.out.println(  Arrays.toString(eachGroup));

            for(int j=0; j<=eachGroup.length-1; j++){
                //String eachMember = eachGroup[j];
                System.out.println(batch21[i][j]);
            }
        }

        System.out.println("==================================");

        //for(int i=)



    }
}
