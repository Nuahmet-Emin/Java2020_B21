package JavaInterview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {


    public static void main(String[] args) {
        System.out.println(removeDuplicate("aabbc"));
        System.out.println(removeDup("AABBC"));
    }

    public static String removeDuplicate(String str){
        String nonDup = "";

        for(int i=0; i<=str.length()-1;  i++){
            if( !nonDup.contains(str.charAt(i)+"") ){
                nonDup+= str.charAt(i);
            }
        }

        return  nonDup;
    }


    public static String removeDup(String str){
        String result = "";

        for(String each : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result += each;
        }
        return result;
    }


}
