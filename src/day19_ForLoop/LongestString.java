package day19_ForLoop;

import java.util.Scanner;
/*
1. write a program that can return the longest string frow two user inputs

    3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

    5. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
    6. ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
Loop: repeated statements
for loop: gets executed every time when condition is true, and stops when condition becomes false
        for( initialization; Conidtion ; Iterator){
                    statements;
        }
        initialization: starting point
                    int i = 0;
        Condition: ending point, creatd based on initialization
                    i < 5

        Iterator: co-related to the condition, resposnible for making the condition false, so that the loop will eventually stop

 */
public class LongestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = scan.nextLine();

        System.out.println("Enter second string: ");
        String s2 = scan.nextLine();

        if(s1.length()> s2.length()){
            System.out.println(s1 + " is longer");
        }else if(s2.length()> s1.length()){
            System.out.println(s2 + " is longer");
        }else{
            System.out.println(s1 + " is equal " + s2);
        }




    }
}
