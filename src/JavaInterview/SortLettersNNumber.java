package JavaInterview;

import java.util.Arrays;

public class SortLettersNNumber {


    public static void main(String[] args) {
        String str = "DC501GCCCA098911";

        String str2 = "";
        String result= "";

        for(int i=0; i<= str.length()-1; i++){
           char ch =  str.charAt(i);
           str2 += ch;
            if(Character.isAlphabetic(ch) && i < str.length()-1){
                if(Character.isDigit(str.charAt(i+1))){
                    str2 += ",";
                }
            }

            if(Character.isDigit(ch) && i < str.length()-1){
                if(Character.isAlphabetic(str.charAt(i+1))){
                    str2 += ",";
                }
            }

        }
        System.out.println(str2);

        String[] arr = str2.split(",");
         str = "";
        for(String each : arr){
            char[] chars = each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){
               str += eachChar;
            }
        }

        System.out.println(str);

    }

    public static void sortLettersNumbers(String str){

    }


}
/*
String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together

Ex:

Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"
 */