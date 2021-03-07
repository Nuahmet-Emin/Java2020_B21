package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindOutDifferentLetter {

    public static void main(String[] args) {

        String str1 = "This apple is sweet";
        String str2 = "This apple is not sour ";

        FindDifferentLetter2(str1,str2);
        System.out.println(FindDifferentLetter(str1, str2));

    }

    public static void FindDifferentLetter2 (String str1, String str2){
        String result = "";
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split(" ")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split(" ")));

        for (String each : list1) {
            if (!list2.contains(each)) {
                result += each;
            }
        }

        for (String each : list2) {
            if (!list1.contains(each)) {
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
                result += each + " ";
            }
        }

        return result;
    }
}
