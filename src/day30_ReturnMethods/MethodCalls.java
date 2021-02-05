package day30_ReturnMethods;

import library.StringUtility;
import library.ArrayUtility;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String str = "Level";
        String reversedName = StringUtility.reverse(str);

        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaabbbcccddeee";
        String result2= StringUtility.removeDuplicates(str2);
        System.out.println(result2);

        System.out.println("=================================");

        int[] array = {1,0,-2,30,500,-20,-50,10};
        int[] descending = ArrayUtility.sort(array);
        System.out.println(Arrays.toString(descending));
        System.out.println(ArrayUtility.printArray(descending));

        System.out.println("=================================");

        String s1 = "ccccccccccbbbbbbbbbbbbbbaaaaaaaaaaa";
        String s2 = "bbbbbbbbbbaaaaaaaaaaaaaaacccccccccc";

        boolean b = StringUtility.isAnagram(s1,s2);
        System.out.println(b);


    }
}
