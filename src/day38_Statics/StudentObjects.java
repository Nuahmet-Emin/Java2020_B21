package day38_Statics;

public class StudentObjects {

    public static void main(String[] args) {

     CybertekStudent student1 = new CybertekStudent();
     student1.setInfo("Ayse",21,'F',5);

     CybertekStudent student2 = new CybertekStudent();
     student2.setInfo("Erjon",21,'M',6);

        //System.out.println(student1.schoolName);
        //System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName  ); // preferred



        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Afrooz",21,'F',7);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        /*

        student1.getSchoolInfo();
        student2.getSchoolInfo();
        student3.getSchoolInfo();

         */

        CybertekStudent.getSchoolInfo(); // preferred


    }
}
