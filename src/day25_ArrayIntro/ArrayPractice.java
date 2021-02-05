package day25_ArrayIntro;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] students = new String[5]; // array size is fixed
        students[0] = "Dilfinar";
        students[1] = "Aidana";
        students[2] = "Nurahmet";
        students[3] = "Fatime";
        students[4] = "Atilla";
/*
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);

 */
    for(int i=0; i<students.length; i++){
        System.out.println(students[i]);
    }


    }
}
