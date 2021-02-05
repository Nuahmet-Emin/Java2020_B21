package day43_Inheritance.personTask;

public class Tester extends Employee { // Tester IS a person, Tester IS an Employee
    /*
    inherited:
        variables: name, age, gender, hourlyRate, jobTitle, ID
          methods: work, setInfo, setInfo, eat, sleep, toString

     */


    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);

    }

    public void testing(){
        System.out.println( jobTitle +name + " is testing");
    }
}
/*
Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */
