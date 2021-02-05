package day28_MultiDimensionalArray;

public class LongestString2 {
    public static void main(String[] args) {

        String[] names = {"Elenora","Evelyna", "apple","Pear","Vale","Nurhmet"};
        int maxLength = names[0].length();
        int minLength = names[0].length();

        for(String each : names){ // what is the maximum length
            if(each.length() > maxLength){
                maxLength = each.length();
            }
            if(each.length()< maxLength){
                minLength = each.length();
            }
        }
        System.out.println(maxLength);
        System.out.println(maxLength);

        String longest = "";
        String shortest = "";

        for(String each : names){
            if(each.length()== maxLength){
                longest += each + " ";
            }
            if(each.length() == minLength){
                shortest += each + " ";
            }
        }

        System.out.println(longest);
        System.out.println(shortest);

    }
}
