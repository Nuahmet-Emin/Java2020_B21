package Office_Hours.Practice_11_11_2020;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,1,4, 5, 6, 7, 8};

        for(int i=0; i<= arr1.length-1;i++){
            int element = arr1[i];
            for(int j=0; j<=arr2.length-1; j++){
                if(element == arr2[j]){
                    System.out.println(element);
                    break;//exits loop, not to repeat if more than one common element exist in array2
                }
            }
        }
/* my approach
        String result = "";
        for (int i = 0; i <= arr1.length - 1; i++) {
            int count = 0;
            int arr1Element = arr1[i];

            for (int j = 0; j <= arr2.length - 1; j++) {
                if (arr1Element == arr2[j]) {
                    count++;
                }
            }
            if (count > 0) {
                result += arr1Element + " ";
            }
        }
        System.out.println(result);

 */

        System.out.println("================================");

        for(int element : arr1){
            for(int each : arr2){
                if(each == element){
                    System.out.println(element);
                    break;
                }
            }
        }



    }
}


/*
Write a program that can print out the common elements from two integer array
		Ex:
			arr1: {1,2,3,4,5}
			arr2: {4,5,6,7,8}
			output:
				4 5
 */