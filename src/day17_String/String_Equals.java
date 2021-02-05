package day17_String;

public class String_Equals {
    public static void main(String[] args) {
        /*
        How methods are used:
        stringObject.method()
         */
     /*
     equals(): Compare the VALUES of two string, not their object locations like == would
     ->never compares string with == anymore
     ->
      */
        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str == str2);// false
        System.out.println(str.equals(str2)); // true
        



    }
}
