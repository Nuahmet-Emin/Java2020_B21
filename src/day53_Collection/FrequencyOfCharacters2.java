package day53_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters2 {
    public static void main(String[] args) {

        String str = "aaabbc";
        Map<String, Integer>  result = new LinkedHashMap<>();

        for (String s : str.split("")) {// s: a a a b b c
            int f = Collections.frequency(Arrays.asList(str.split("")), s);
            result.put(s,f);
        }


    }
}
