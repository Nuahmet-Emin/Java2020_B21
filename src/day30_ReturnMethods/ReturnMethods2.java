package day30_ReturnMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String names = "racecar";
      // String reversed = reverseStr1(names); void method can not return

        String reversedName = reverseStr2(names);

       // boolean isPalindrome = names.equalsIgnoreCase(reversedName);
    }
    //void
    public static void reverseStr1(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    //return method;
    public static String reverseStr2(String str){
        String result = "";

        for(int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }


}
