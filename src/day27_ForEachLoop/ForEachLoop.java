package day27_ForEachLoop;

/*
For each loop: a loop that is already iterated. starts from the index 0 till last index
precondition: there MUST be a data structure in order to use for each
order is fixed

for(DataType each: Collection of Data){
}
 */
public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Nurahmet", "Dilfinar", "Aidana", "Fatime"};

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.println("===================================");

        for (String each : names) { // each is the element
            System.out.println(each);
        }

        System.out.println("==============================");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int countEven = 0;
        int countOdd = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("============================");

        int[] scores = {10,2,3,100,-5,-2,1000,30,40,56};
        int max = scores[0];

        for (int each : scores) {

        }

    }
}
