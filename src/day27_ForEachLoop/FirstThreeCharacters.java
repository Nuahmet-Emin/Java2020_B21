package day27_ForEachLoop;

public class FirstThreeCharacters {
    public static void main(String[] args) {

        /*
        create string array, and store the names of your  class mates (10)
            print the first three characters of each name
         */
        String[] students = {"Delaram", "Aysel", "Nurahmet", "Dilfinar", "Aidana", "Fatime","Atilla" +
                "Batoor", "Sultan","Memet"};

        for(String each : students){
            System.out.println(each.substring(0,3));
        }


    }
}
