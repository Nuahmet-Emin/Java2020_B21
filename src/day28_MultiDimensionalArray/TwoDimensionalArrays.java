package day28_MultiDimensionalArray;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3, 4}, {5, 60}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};
        //                   0       1        2        3              4

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for(int i=0; i<=arr2D.length-1; i++){ // i: index of single dimensional array
            int[]arr1D = arr2D[i];

            for(int j=0; j<=arr1D.length-1; j++){
                int eachElement= arr1D[j];
                if(eachElement > max){
                    max = eachElement;
                }
                if(eachElement < min){
                    min = eachElement;
                }
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}
