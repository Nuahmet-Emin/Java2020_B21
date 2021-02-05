package day52_Collection;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());

        numbers.add(100);

        System.out.println(numbers.size());

        numbers.addAll(Arrays.asList(200,300,400,500));

        System.out.println(numbers.size());

        System.out.println(numbers);

        System.out.println(  ( (List)numbers).get(0)   );

        Collection<String> names = new LinkedHashSet<>();
        Collection<Integer> scores = new LinkedList<>();


    }
}
