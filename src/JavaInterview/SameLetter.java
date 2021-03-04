package JavaInterview;

import java.util.Arrays;

public class SameLetter {

    public static void main(String[] args) {
        System.out.println(sameLetter("abc","acb"));
        System.out.println(sameLetter1("abc","abc"));
    }

    public static boolean sameLetter1(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

       return (Arrays.equals(ch1,ch2));
    }

    public static boolean sameLetter(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "";
        String a2 = "";

        for(char each : ch1){
            a1 += each;
        }

        for(char each : ch2){
            a2 += each;
        }

        if(a1.equals(a2)){
            return true;
        }else{
            return false;
        }
    }
}
/*
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */
