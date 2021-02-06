package WarmpUps.day26;

public class LongestWordFromArray {
    public static void main(String[] args) {

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programmin"};

        int longestWordLen = words[0].length();
        // System.out.println(longestWordLen); 6
        String longestWord = "";

        for (int i = 1; i <= words.length - 1; i++) {
            int eachWordLen = words[i].length();
            if (eachWordLen > longestWordLen) {
                longestWordLen = eachWordLen;
                longestWord += words[i];
            }
        }
        // to check if there is another word has the same length
        for (int j = 0; j <= words.length - 1; j++) {
            int sinleWordLen = words[j].length();
            if (sinleWordLen == longestWordLen) {
                if (!longestWord.contains(words[j])) {
                    longestWord += " " + words[j];
                }

            }
        }
        System.out.println(longestWord); //Strawberry Programmin


    }
}
/*
6. print out the longest words from an array of String
            String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programmin"};
            output:
                Strawberry Programmin

 */