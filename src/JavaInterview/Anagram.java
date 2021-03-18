package JavaInterview;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram2(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);



        if(arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
             if(arr1[i].equals(arr2[i])){
                 return true;
             }
        }
        return false;
    }


    public static boolean isAnagram2(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String result1 = "";
        String result2 = "";

        for(int i=0; i<=arr1.length-1; i++){
            result1 += arr1[i];
            result2 += arr2[i];
        }

        if(result1.equals(result2)){
            return true;
        }
        return false;
    }
}
