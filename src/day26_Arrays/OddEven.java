package day26_Arrays;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {

        int[] arr = new int[100];

        // 1~100
        for (int i = 0; i < 100; i++) {
            /*
            arr[0] = 0; i+1
            arr[1] = 1; i+1 = 2
             */
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        /*
        1.how many even numbers
        2.how many odd numbers in array
        3.how many numbers is evenly divisible by 3
        4.how many numbers is evenly divisible by 5
         */
        int countEven = 0;
        int countOdd = 0;
        int countDivisibleBy3 = 0;
        int countDivisibleBy5 = 0;
        for (int i = 0; i < 100; i++) {
            int eachNumber = arr[i];
            if (eachNumber % 2 == 0) {
                countEven++;
            }else{
                countOdd++;
            }

            if(eachNumber % 3 == 0){
                countDivisibleBy3++;
            }
            if(eachNumber % 5 ==0){
                countDivisibleBy5++;
            }

        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
        System.out.println("Divisible by 3: " + countDivisibleBy3);
        System.out.println("Divisible by 5: " + countDivisibleBy5);
    }
}
