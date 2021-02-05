package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        /*
        Scrum Team:
                Testers;
                Developers
                SM
                PO
                BA
         */

        String[][] scrumTeam={
                {"Dorin","Adil","Fatih","Subhi"},
                {"Katrin","Mustafa","Ruslan"},
                {"Ayse"},
                {"Omid"},
                {"Agalar"}
        };
        System.out.println(Arrays.deepToString(scrumTeam));
        for(int i=0; i<=scrumTeam.length-1; i++){
            System.out.println(Arrays.toString(scrumTeam[i]));
            for(int j=0; j<=scrumTeam[i].length-1; j++){
                System.out.println(scrumTeam[i][j]);
            }
        }

        System.out.println("===============================");

        for(String[] eachTeam : scrumTeam ){
            System.out.println(Arrays.toString(eachTeam));

            for(String eachName : eachTeam){
                System.out.println(eachName);
            }
        }



    }
}

