package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 2.5, 3.5};
        double[] arr2 = {4.5,5.5,6.5,7.5};
        double[] arr3 = {8.5, 9.5};
        double[] arr4 = {10.5, 12.5, 11.5};

        double[] arr5 = combineTwoArrays(  combineTwoArrays(arr1,arr2), combineTwoArrays(arr3,arr4)  );
        //       combinesTwoArrays ( new array, new array)
        //       new array

        System.out.println(Arrays.toString(arr5));

        int[] a1 = {1,2,3};
        int[] a2 = {3,4,5,6};
        int[] a3 ={7,8,9};

        int[] a4 =combineTwoArrays( combineTwoArrays(a1,a2) , a3);

        System.out.println(Arrays.toString(a4));

        String[] group1 = {"Nurahmet","Fatime"};
        String[] group2 = {"Dilfinar","Aidana"};
        String[] group4 ={"Memetemin", "Meghfiret","Nurmemet", "Nuradil","Nurbia"};
        String[] group5 = {"Murat","Arzigul","Zohre","Nijat"};

        String[] family = combineTwoArrays(  combineTwoArrays(group2,group5) , combineTwoArrays(group1,group4) );
        System.out.println(Arrays.toString(family));


        String[] group3 =combineTwoArrays(group1,group2 );
        System.out.println(Arrays.toString(group3));

    }

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

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
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

}
