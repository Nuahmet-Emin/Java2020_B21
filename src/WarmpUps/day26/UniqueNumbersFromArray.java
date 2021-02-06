package WarmpUps.day26;

public class UniqueNumbersFromArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,4};

        String uniqueNums = "";

        for(int i=0; i<=arr.length-1; i++){
            if(!uniqueNums.contains( ( arr[i]+""))){
                uniqueNums +=" "+ arr[i];
            }
        }
        System.out.println(uniqueNums);



    }
}
/*
 7. write a program that can find the unique numbers from an integer array
            int[] arr ={1,2,3,1,2,4}
            output:
                3 4

 */