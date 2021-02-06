package TestNQuiz.UnitTest3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q28 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList
                ("during", "storm","rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for(String word : words){
            lengths.add(word.length()); // length() is missing in the test
        }
        System.out.println(lengths);

    }
}
