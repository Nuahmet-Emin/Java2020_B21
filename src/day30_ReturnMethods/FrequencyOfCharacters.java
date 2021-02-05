package day30_ReturnMethods;
import library.StringUtility;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        String result = ""; // a3b4c2

        String nonDup= StringUtility.removeDuplicates(str); //a b c
       // System.out.println(nonDup);

        for(int i=0; i<=nonDup.length()-1; i++){
            char ch =nonDup.charAt(i); // a
            int frequency = StringUtility.frequency(str,ch);    // 3 4 2
            result += "" + ch + frequency;

        }

        System.out.println(result);
        System.out.println("===========================");

        String str2 = "aaaaaaaaaaaaaabbbbbbbbbbvvvvvvvvvv";
        String r = frequencyOfCharacters(str2);
        System.out.println(r);
    }

    public static String frequencyOfCharacters(String str){
        String result = ""; // a3b4c2

        String nonDup= StringUtility.removeDuplicates(str); //a b c

        for(int i=0; i<=nonDup.length()-1; i++){
            char ch =nonDup.charAt(i); // a
            int frequency = StringUtility.frequency(str,ch);    // 3 4 2
            result += "" + ch + frequency;
        }
        return result;
    }
}
