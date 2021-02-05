package day26_Arrays;

public class FrequencyOfEachChars {
    public static void main(String[] args) {

        String str = "aaabbc";// a3b2c1
        // step1 : remove duplicates
        String nonDup = ""; // abc
        for (int i = 0; i < str.length(); i++) {
            String eachChar = "" + str.charAt(i); // a, a, a, b,b, c
            if (!nonDup.contains(eachChar)) {
                nonDup += eachChar;
            }
        }
        System.out.println(nonDup);

        String result =""; // "a3b2c1"
// Step 2: find the frequency of each nonDup characters from the original string
        for(int j=0; j<nonDup.length(); j++){
            char ch = nonDup.charAt(j); // a
            int count = 0; // to contain the frequency of char ch

            for(int i=0; i< str.length(); i++){
                char eachChar = str.charAt(i); // a, a, a, b, b, c
                if(ch == eachChar){
                    count++;
                }
            }
            result +="" + ch + count;
        }




        System.out.println(result);


    }
}
