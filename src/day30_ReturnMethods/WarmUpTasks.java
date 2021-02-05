package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {
        positiveNegativeZero(8);

        int[] numbers = {1, 2, 3, -4, 7, 11, 0};
        for (int each : numbers) {
            positiveNegativeZero(each);
        }
        System.out.println("====================================");

        gradeCalculator(81);
        gradeCalculator(120);
        System.out.println("====================================");
        int[] a1 = {10, 40, 20};
        int[] a2 = {50, 60};
        combineTwoArrays(a1, a2);

        System.out.println("====================================");
        removeDuplicates("aabccddeeeeeeeeeeeeeeeeeddddd");

        System.out.println("====================================");
        formattedFullName("NUrahmet","AZAt");

    }

    //task1:
    public static void positiveNegativeZero(int number) {
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(number + " is " + result);

    }

    //task2:
    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            //System.out.println((score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F');
        } else {
            System.out.println("Invalid Score");
        }

    }

    //task3:
    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index numbs of arr3

        for (int each : arr1) {
            arr3[i++] = each;
        }
        //i=2
        for (int each : arr2) {
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }

    //task4:
    // create a function that can print a string without the duplicated characters
    public static void removeDuplicates(String str) { // "aabccb"
        String result = ""; // "abc"
/*
        for (String each : str.split("")) { // each: [a,a,b,c,c,b]

            if (!result.contains(each)) {
                result += each;
            }
        }
 */
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }


    //task5:
    public static void formattedFullName(String first, String last) {
        first= first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String result = first + " " + last;
        System.out.println(result);
    }


}

/*
Warmup tasks:
    1. create a function that can check if the given integer is positive, negative or zero
    2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays

    5.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */
