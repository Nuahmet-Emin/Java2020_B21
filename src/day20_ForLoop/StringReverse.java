package day20_ForLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "abc";

        String result = ""; // cba

        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println("Result: " + result);

    }
}
