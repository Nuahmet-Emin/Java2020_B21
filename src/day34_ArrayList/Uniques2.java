package day34_ArrayList;

import javax.security.auth.callback.CallbackHandler;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {
        ArrayList<Integer > numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,3,4,5,5,5,8,9));

        numbers.removeIf(p-> Collections.frequency(numbers,p)>1)    ;

        System.out.println(numbers);

        System.out.println("=======================================");

        String str = "aabaacdde";
        ArrayList<String>  list = new ArrayList<>( Arrays.asList(str.split("")));
        list.removeIf(p-> Collections.frequency(list,p) > 1);
        System.out.println(list);

        String result = list.toString().replace(", ","").substring(1).replace("]", "");
        System.out.println(result);

        System.out.println("=======================================");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','c','3','d','*','('));

        //chars.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        chars.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(chars);
    }
}
/*
Task:
        1. write a program that find the unique names from an arraylist of string
                        DO NOT USE:
                                for loop, for each loop, while loop, do while loop

        2. write a program that can remove the digits and letters from an array list of characters
                        DO NOT USE:
                                for loop, for each loop, while loop, do while loop

 */