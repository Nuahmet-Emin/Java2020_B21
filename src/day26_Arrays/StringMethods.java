package day26_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "abcde";

        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));

        System.out.println("================================");
        // anagram task:
        String s1 = "acb";
        String s2 = "bac";

        char [] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println(isAnagram);

        //split(str)

        String sentence = "Today is great day";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));







    }
}
