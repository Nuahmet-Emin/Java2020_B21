package day20_ForLoop;

import java.util.Scanner;

public class NonDup {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a word: ");
        String str = "AABBCCDE";
        String frequency = "";

        String nonDup =""; //ABC

       for(int i=0; i<=str.length()-1; i++){
           char ch = str.charAt(i); //A
           if(!nonDup.contains(ch+"")){
               nonDup += ch;
           }
           //nonDup += "" + frequency;
       }
        System.out.println(nonDup); // ABC

        System.out.println("==================================================");

       // frequency

       for(int i=0; i<=nonDup.length()-1; i++){
           int count =0;
           char ch1 = nonDup.charAt(i); // A
           for(int j=0; j<=str.length()-1; j++){
               // 'A'     A A B B C C
              if(ch1 == str.charAt(j)){
                  count +=1; //
              }
           }
           frequency = ""+ count + ch1 ;
           System.out.print(frequency);

       }
        System.out.println();

        System.out.println("=====================================");
       // str = "AABBC"
       // nonDup = "ABC"
       String uniques="";

       for(int i=0; i<=nonDup.length()-1; i++){
           char ch3 = nonDup.charAt(i); // A B C
           int count = 0;

           for(int j=0; j<=str.length()-1; j++){
               // A       A A B B C
               if(ch3 == str.charAt(j)){
                   count += 1;
               }
           }
           if(count ==1){
               uniques += ch3;
           }
       }
        System.out.println(uniques);

    }
}
