package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Katy");
        students.add("Amir");
        students.add("Nadira");
        students.add("Erjon");
        students.add("Amir");
        students.add("Aibek");
        students.add("Ilgar");
        students.add("Amir");

        System.out.println(students);

        students.remove(1);

        System.out.println(students);

        students.remove("Amir");

        System.out.println(students);

        students.remove(students.size()-1)  ;


    }
}
