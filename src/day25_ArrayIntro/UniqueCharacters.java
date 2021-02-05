package day25_ArrayIntro;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcababe";
        String result = ""; //ce
         // 1+1+1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each char in
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // i represents the index of str
                char eachChar = str.charAt(i); // each characters of str
                if (eachChar == ch) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }


        System.out.println(result);

    }
}
