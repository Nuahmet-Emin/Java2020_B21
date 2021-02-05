package day27_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Nurahmet", "Dilfinar", "Aidana", "Fatime"};

        for (String each : names) {
            String reversedName = "";
            for (int i = each.length() - 1; i >= 0; i--) {

             reversedName+=  each.charAt(i);
            }
            System.out.println(reversedName);
        }



    }
}
