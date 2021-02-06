package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        int frequency = 0;
        scan.close();

        for(int i=0; i<=str.length()-1; i++){
            char eachChar = str.charAt(i);
            if(ch == eachChar){
                frequency++;
            }
        }
        System.out.println(frequency);



    }
}
/*
 1. frequency of a char
            String str = "aaabcde";

 */