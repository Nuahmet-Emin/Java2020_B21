package day28_MultiDimensionalArray;

public class TwoDimensionalArrays2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3, 4}, {5, 60}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for(int[] each1DArray : arr2D){
            for(int eachNum : each1DArray){

                if(eachNum > max) {
                    max = eachNum;
                }
                if(eachNum < min){
                    min = eachNum;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
