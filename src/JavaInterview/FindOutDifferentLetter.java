package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindOutDifferentLetter {

    public static void main(String[] args) {
        String result = "";
        String str1 = "This apple is sweet";
        String str2 = "This apple is not sour ";

        System.out.println(FindDifferentLetter(str1, str2));

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split(" ")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split(" ")));
        /*String[] arr1 = str1.split(" ");
        String [] arr2 = str2.split(" ");
*/
       /* for(int i =0; i<= arr1.length-1; i++ ){
            if((!arr1[i] .equals(arr2[i]))){
                result += arr1[i] +" "+ arr2[i];
            }
        }*/

        System.out.println("--------------------------------------------------");
     // 1.
        System.out.println(list1);

        for(String each : list1){
            if(!list2.contains(each)){
                result += each;
            }
        }
        System.out.println(result);

        for(String each : list2){
            if(!list1.contains(each)){
                result += " " + each;
            }
        }

        System.out.println(result);
    }

    public static String FindDifferentLetter(String str1, String str2){

        String result = "";
        String [] words = (str1 + " " +  str2).split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words))  ;

        for (String each : list) {
            int f = Collections.frequency(list, each);
            if(f == 1){
                result += " " + each;
            }
        }

        return result;
    }
}
