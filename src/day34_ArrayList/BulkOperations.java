package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        // containsAll
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        boolean r1 = list.contains(10);

        boolean r2 = list.contains(30) && list.contains(50) && list.contains(40);

        System.out.println("r1= " + r1);
        System.out.println("r2= " + r2);

        // verify if 30,40,50 all are contained in the list
       boolean r3 = list.containsAll(Arrays.asList(30,40,50)    );
        // Arrays.asList() from Array Utility Package--> converts array to collection type
        System.out.println(r3);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("abv");
        group1.add("adam");
        group1.add("ercan");
        group1.add("svetlana");

        // verify adam, ercan, biden

        boolean r4 =group1.containsAll(Arrays.asList("adam","ercan","biden"));
        System.out.println(r4);

        boolean r5 = group1.containsAll(Arrays.asList("adam","svetlana"));
        System.out.println(r5);

        System.out.println("======================================");

        //addAll()

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','Z','C','B','H','H','I','K'));
        System.out.println(chars);

        String[] names = {"Dilfinar","Aidana","Fatime","Nurahmet"};
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));

        System.out.println(students);

        int[] arr = {1,2,3,4,5};

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E')   );
        ch1.addAll(Arrays.asList('H','I','J','K','L') );

        System.out.println(ch1);
    }
}
