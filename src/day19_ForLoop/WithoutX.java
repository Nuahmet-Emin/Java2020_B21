package day19_ForLoop;

import java.util.Scanner;
/*
 2. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
public class WithoutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

        //if(word.startsWith("x") || word.startsWith("X")){
            if(word.toLowerCase().startsWith("x")){
            //word = word.substring(1,word.length());
                System.out.println(word.substring(1));
        }else{
                System.out.println(word);
            }
        //System.out.println(word);


        System.out.println("=================================");

            char firstChar = word.charAt(0);

        if (firstChar == 'X' || firstChar == 'x') {
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

    }
}
