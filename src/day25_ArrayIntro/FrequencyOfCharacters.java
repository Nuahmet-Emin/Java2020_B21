package day25_ArrayIntro;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "ababcaa";
        //output= a4b2c1
        String nonDup = "";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);
                if (ch == eachChar) {
                    count++;
                }
            }
            if (!nonDup.contains(ch + "")) {
                nonDup += "" +ch +count;
            }

        }
/*
        for(int i=0; i<nonDup.length(); i++){
            char ch1 = nonDup.charAt(i);
            int count1 = 0;

            for(int j=0; j<str.length(); j++){
                char each = str.charAt(j);
                if(ch1 == each){
                    count1 ++;
                }
            }


            result +="" + ch1 + count1;
        }
 */

        System.out.println(nonDup);
        System.out.println(result);
        

    }
}
