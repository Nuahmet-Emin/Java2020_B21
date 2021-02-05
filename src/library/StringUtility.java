package library;

import java.util.Arrays;

public class StringUtility {

    //returns the frequency of given single char from a given string as int
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) { //[a,a,a,b,c]
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    //returns the unique characters for the given string
    public static String unique(String str){
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            char each = str.charAt(i);
            int count = frequency(str,each);
          /*  if (frequency(str,str.charAt(i)) == 1) {
                unique += str.charAt(i);
            }*/
            if(count ==1){
                unique += each;
            }
        }
        return unique;
    }

    // reverses the given string object and retuns it
    public static String reverse(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    // removes the duplicates from he string and returns it
    public static String removeDuplicates(String str) { // "aabccb"
        String result = ""; // "abc"
/*
        for (String each : str.split("")) { // each: [a,a,b,c,c,b]

            if (!result.contains(each)) {
                result += each;
            }
        }
 */
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
       return result;
    }

    // returns the frequency of characters
    public static String frequencyOfCharacters(String str){
        String result = ""; // a3b4c2

        String nonDup= StringUtility.removeDuplicates(str); //a b c
        // System.out.println(nonDup);

        for(int i=0; i<=nonDup.length()-1; i++){
            char ch =nonDup.charAt(i); // a
            int frequency = StringUtility.frequency(str,ch);    // 3 4 2
            result += "" + ch + frequency;
        }
        return result;
    }

    /*
    anagram:
    "adbbdbd" ==> adb
    "dbaaaaaaa" ==>dba

    output
          true

          verify if two string are anagram, returns the boolean result
     */

    /*
    takes a sentence and word, then return the frequency of the word in the sentence
     */
    public static int frequencyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int frequency = 0;


        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;

    }

    public static boolean isAnagram(String str1, String str2){
        str1 = removeDuplicates(str1);
        str2 = removeDuplicates(str2);

        char[] ch1 = str1.toCharArray(); // adb
        char[] ch2 = str2.toCharArray();// dba

        Arrays.sort(ch1);// [a ,b , c]
        Arrays.sort(ch2);// [a , b, c]

        return Arrays.equals(ch1,ch2);




    }

      //verify if the string is palindrome
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }



}
