package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scan.next();
        String result = "";
        String duplicates = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            int count = 0;
            for(int j=0; j<=str.length()-1; j++){
                char eachChar = str.charAt(j);
                if(ch == eachChar){
                    count++;
                }
            }
            if(count==1){
                result += ch;
            }
            if(count >1 && !duplicates.contains("" + ch)){ // in order to contain one char
                duplicates += ch;
            }
        }
        System.out.println("Unique chars:" + result);
        System.out.println(duplicates);


    }
}
// unique: if frequency is equal to 1
