package day37_CustomeClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");

        Student student1 = new Student();
        student1.setInfo("Aaron",'M', LocalDate.of(2000,11,2),"1234",3.5);

        System.out.println(list.toString());
        System.out.println(str);

        System.out.println(student1.toString());


        Student student2 = new Student();
        student2.setInfo("Dan",'M',LocalDate.of(2001,11,11),"123",3.8);

        System.out.println(student2.toString());

        Student student3 = new Student();
        student3.setInfo("Ma",'F',LocalDate.of(1999,1,1) ,"9994",3.4);

        System.out.println("=======================================");

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(studentList);

        Student[] students = {student1,student2,student3};
        System.out.println(Arrays.toString(students));

        System.out.println("==========================================");

        for(Student each : students){
            if(each.ID.equals("9994")){
                System.out.println(each);
            }

        }

        System.out.println("==========================================");
        Student s1 = new Student();
        Student s2 = s1;

    }
}
