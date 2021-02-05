package day26_Arrays;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};

        String uniques = "";
        for (int j = 0; j <= words.length - 1; j++) {
            String word = words[j]; // "C#"
            int count = 0;

            for (int i = 0; i <= words.length - 1; i++) {
                String eachWord = words[i];
                if (word.equals(eachWord)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques += word+" ";
            }
        }

        System.out.println(uniques);


    }
}
/*
 print the unique words from an array of String
            String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"}
            output:
                Java Ruby C++

 */
