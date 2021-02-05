package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] names = {"Cybertek","Muhter","Nurahmet", "Fatime", "Dilfinar"};
        // index num:        0          1         2            3         4
        // retrieve data from array;
        System.out.println(names[2]);
        String str1 = names[0];
        System.out.println(str1);

        int[] scores = {100, 100, 99, 97, 95};
        // index:        0     1   2   3   4

        //Fatime : 97
        /*
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);

         */
        for(int i=0; i<=names.length-1; i++){ // length is not a method in array
            System.out.println(names[i] + " : " + scores[i]);
        }




    }
}
