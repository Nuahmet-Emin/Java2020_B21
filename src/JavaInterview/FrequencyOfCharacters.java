package JavaInterview;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars(str));
        System.out.println( FrequencyOfChars2(str));
    }

    public static String FrequencyOfChars(String str){
        String result = "";

        String nonDup = "";

        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(!nonDup.contains(ch + "")){
                nonDup += ch; //"ABCD"
            }
        }

        System.out.println(nonDup);


        for(int i=0; i<= nonDup.length()-1; i++){
            int count = 0;
            for(int j=0; j<=str.length()-1; j++){
                if(  str.charAt(j) == nonDup.charAt(i)){
                    count++;
                }
            }
            result +=  nonDup.charAt(i)+ "" + count;
        }

        return result;
    }

    public static String FrequencyOfChars2(String str) {
         String result = "";

        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split(""))) ;
        for(String each : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result += each + Collections.frequency(list,each);
        }
        return result;
    }

    public static String FrequencyOfChars3(String str){
        String result = "";

        return result;
    }

}
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */