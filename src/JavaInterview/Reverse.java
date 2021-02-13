package JavaInterview;

public class Reverse {
    //Write a return method that can reverse  String
    //
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("abcd"));
    }

    public static String reverseString(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }

        return result;
    }

    public static String StrReverse(String str){
        return new StringBuffer(str).reverse().toString();
    }
}
