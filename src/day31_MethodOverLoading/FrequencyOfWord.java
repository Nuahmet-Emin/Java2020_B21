package day31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "java python java";
        String word = "java";

        System.out.println(frequencyOfWord(str,word));

        String str2 = "java JAVA C#, c# python";
        int countJava= StringUtility.frequencyOfWord(str2,"java");
        int countCSharp = StringUtility.frequencyOfWord(str2,"c#"   );

    }

    public static int frequencyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int frequency = 0;


        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;

    }


}
/*
1.  write a return method called frequencyOfWord that accepts two parameters: string str and
String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3

 */
