package day20_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word= scan.nextLine();

        String result = "";

        for(int i=word.length()-1; i>=0; i--){
            result += word.charAt(i);
        }

        if(result.equalsIgnoreCase(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }



    }
}
