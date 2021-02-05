package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,10));
        /*
        for(int i=0; i<=numbers.size()-1; i++){
            if(numbers.get(i) <= 5) {
                numbers.remove(i);
            }
        }
         */
        System.out.println(numbers);

        Predicate<Integer> lessThan5 = each -> each<5;
        numbers.removeIf(lessThan5);
        System.out.println(numbers);

        System.out.println("==================================");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,10));

        numbers2.removeIf(p->p<7);
        System.out.println(numbers2);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,10));
        scores.removeIf(p-> p % 3 == 0 || p %5 ==0);

        System.out.println(scores);

        System.out.println("=================================");

        ArrayList<String> employee3 = new ArrayList<>();
        employee3.addAll(Arrays.asList("Nurahmet","Ahmed","Kadi","Sadi"));
        employee3.removeIf(p->p.toLowerCase().contains("a") || p.toLowerCase().contains("r"));
        System.out.println(employee3);
    }
}
