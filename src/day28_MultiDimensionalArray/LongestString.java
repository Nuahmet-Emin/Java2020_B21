package day28_MultiDimensionalArray;

public class LongestString {
    public static void main(String[] args) {

        String[] names = {"Nurahmet", "Fatime","Dilfinar","Aidana","CJ"};

        String longest = names[0];
        String shortest = names[0];

        for(String each : names){

            if(each.length()> longest.length()){
                longest = each;
            }
            if(each.length()< shortest.length()){
                shortest = each;
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
