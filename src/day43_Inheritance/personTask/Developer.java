package day43_Inheritance.personTask;

public class Developer extends Employee { // Developer IS A Person and is Employee

    /*
    Inherited:
         variables: name, age, gender, hourlyRate, jobTitle, ID
          methods: work, setInfo, setInfo, eat, sleep, toString
     */

    public Developer(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void coding(){
        System.out.println(jobTitle + " " + name + " is coding");
    }

}
