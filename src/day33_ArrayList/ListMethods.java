package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMethods {

    public static void main(String[] args) {

        // set:
        ArrayList<String> names = new ArrayList<>();

        names.add("Dilfinar");
        names.add("Fatime");
        names.add("Aidana");
        names.add("Nurahmet");
        names.add("Murat");
        names.add("Azat");

        System.out.println(names);

        names.set(3,"Afrooz");
        names.set(5,"Fiona");
        System.out.println(names);

        int[] arr = {10,20,30,50};
        arr[1] = 200;

        System.out.println(Arrays.toString(arr));

         // remove(index) removes one object at a time
        ArrayList<Character> list = new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        //remove(object) removes one object at a time
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        Character ch = 'C';

        //list2.remove(ch);
      boolean r1 =  list2.remove(Character.valueOf('C'));
        System.out.println(list2);
        System.out.println(r1);


    }
}
