package day37_CustomeClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public int age;
    public LocalDate DOfB;
    public char gender;
    public double gpa;

    public void setInfo(String studentName, char studentGender, LocalDate DateOfBirth, String studentID, double GPA){
        name = studentName;
        DOfB = DateOfBirth;
        age = LocalDate.now().getYear()-DOfB.getYear();
        gender = studentGender;
        ID = studentID;
        gpa = GPA;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", DOfB=" + DOfB +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }

    public void study(double studyHours){
        System.out.println(name + " studies " + studyHours + " each day");
    }

    public void sleep(double sleepHours){
        System.out.println(name + " sleeps " + sleepHours + " each day");
    }
}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep

 */