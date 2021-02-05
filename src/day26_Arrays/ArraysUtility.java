package day26_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println(numbers);// hashcode

        System.out.println(Arrays.toString(numbers));

        String[] classMates = {"nurahmet", "Fatime","Dilfinar", "Aidana", "Batur"};

        System.out.println(classMates); // hashcode

        System.out.println(Arrays.toString(classMates));
       // System.out.println(Arrays.toString(classMates).replace("[", "{").replace("]","}"));

        //sort(array)

        int[] arr1 = {2000,10000, 4000, 6000000,30,90};

        Arrays.sort(arr1); // doesn't return any variable, cannot be assigned to a variable nor
        // pass it in print statement
        //System.out.println(Arrays.sort(arr1));

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: " + arr1[arr1.length-1]);
        System.out.println("Min: " + arr1[0]);

        double[] arr2 = {1.5, 0.5, 2.5, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};
        Arrays.sort(arr2);

        System.out.println( Arrays.toString(arr2) );
        System.out.println("Second min number: " + arr2[1]);
        System.out.println("Second max number: " + arr2[arr2.length-2]);

        String[] names = {"Haroon", "Nurahmet","Livio","Dean","Ayah","Afrooz","me"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // equals(arr1, arr2)
        int [] a1 = {1,2,3};
        int [] a2 = {1,3,2};

        /*Arrays.sort(a1);
        Arrays.sort(a2);
*/
        boolean r1 = Arrays.equals(a1,a2);

        System.out.println(r1);


    }
}
