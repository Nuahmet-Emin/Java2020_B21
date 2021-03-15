package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class MostFrequentWord {

    public static void main(String[] args) {

        String sentence = "java python java python java c# python java";
        System.out.println("mostFrequentWord(sentence) = " + mostFrequentWord(sentence));
        System.out.println(mostFrequentWord1(sentence));
    }

    public static String mostFrequentWord1(String sentence){
        String result = "";
        int maxFreq = 0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
      for(String each : new LinkedHashSet<>(Arrays.asList(sentence.split(" ")))) {
          int f = Collections.frequency(list, each);

          if (f >= maxFreq) {
              maxFreq = f;
              result += maxFreq+each;
          }
      }
        return result;
    }

    public static String mostFrequentWord(String sentence){

        String nonDup = "";
        String mostFrequentWord ="";
        String leastFrequentWord = "";

        for (String each : sentence.split(" ")) {
            if (!nonDup.contains(each)) {
                nonDup += each + " ";
            }
        }

        int maxFreq = 0;
        for (String each : nonDup.split(" ")) {
            int count =0;

            for (String eachWord : sentence.split(" ")) {
                if(each.equals(eachWord)){
                    count ++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
                mostFrequentWord =each;
            }

            if(count ==1){
                leastFrequentWord = each;
            }
        }
        return mostFrequentWord;
    }
}
