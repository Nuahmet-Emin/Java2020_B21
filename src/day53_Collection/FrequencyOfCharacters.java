package day53_Collection;

import java.beans.beancontext.BeanContextChild;
import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbc";
        String result = "";

        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += s + Collections.frequency(Arrays.asList(str.split("")), s);
        }

        System.out.println(result);

        System.out.println("===========================");

        //List to Set
        List<Integer> list = Arrays.asList(1,2,3,4,5,6, 7,8,9,101,2,3,4,5,6,7,8,9,10);
        Set<Integer> set = new LinkedHashSet<>(list);

        // Set to List

    }
}
