package day38_Statics;

public class CybertekStudent {
    public String name;
    public int age;
    public char gender;
    public int groupNumber;

    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;

    public void setInfo(String name, int age, char gender, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying java");
    }

    public static void getSchoolInfo(){
        System.out.println("School is: " + schoolName);
    }



    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geder=" + gender +
                ", groupNumber=" + groupNumber +
                ", School name: " + schoolName +
                ", is online: " + isOnlineStudent+
                '}';
    }
}
