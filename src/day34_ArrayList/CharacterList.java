package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterList {
    public static void main(String[] args) {

        String str = "abf178278jksfjdl(($__(*#";

        ArrayList<String> digits = new ArrayList<>(Arrays.asList(str.split("")));
        digits.removeIf(p-> !Character.isDigit(p.charAt(0)));  // removes the characters that are not digits
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p-> !Character.isLetter(p.charAt(0)));// removes the characters that are not letters
        System.out.println(letters);

        ArrayList<String> specialChars = new ArrayList<>( Arrays.asList( str.split("")));
        specialChars.removeAll(digits);
        specialChars.removeAll(letters);
        //specialChars.removeIf(p->Character.isLetter(p.charAt(0)) || Character.isDigit(p.charAt(0)) );
        System.out.println(specialChars);


    }
}
