package day43_Inheritance.restaurant;

import day43_Inheritance.personTask.Employee;

public class Server extends Employee {

    public Server(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
       setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void takeOrder(){
        System.out.println(jobTitle + " " + name + " is taking order");
    }

    public void cleanTable(){
        System.out.println(jobTitle + " " + name + " is cleaning table");
    }
}
