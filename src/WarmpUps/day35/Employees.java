package WarmpUps.day35;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {

    public String employeeName;
    public char employeeGender;
    public String employeeSSN;
    public String employeeID;
    public String employeeJobTitle;
    public String companyName;
    public int employeeSalary;

    public void setInfo(String name,char gender, String SSN,String ID, String title,String company,int salary ){
        employeeName = name;
        employeeGender = gender;
        employeeSSN = SSN;
        employeeID= ID;
        employeeJobTitle = title;
        companyName = company;
        employeeSalary = salary;
    }

    public void getInfo(){
        System.out.println("Employee Name: " + employeeName + "\nGender: " + employeeGender + "\nSSN: " + employeeSSN
        + "\nEmployee ID: " + employeeID + "\nCompany Name: " + companyName +", Title: " + employeeJobTitle + "\nSalary: " +employeeSalary );
    }

    public void attendMeeting(double hours){
        System.out.println(employeeName + " attends " + hours + " of meeting each week");
    }

    public void working(boolean isWorking){
        System.out.println(employeeName + " is working: " + isWorking);

    }

    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setInfo("John",'M',"123-33-3333","123","SDET","Apple",125000);
        employee2.setInfo("Mike",'M',"124-22-4444","124","QA","Bank of America",950000);
        employee3.setInfo("July",'F',"333-33-5555","125","Tester","Safeway",90000);
        employee4.setInfo("Nancy",'F',"123-33-6666","126","SDET","Google",160000);
        employee5.setInfo("Adam",'M',"123-33-7777","127","QA Engineer","Twitter",150000);



        ArrayList<Employees>  employees = new ArrayList<>();
        employees.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
        employees.removeIf(p->p.employeeSalary<100000);

    }

}
/*
 2. Employees:
            Attributes:
                name, gender, SSN, ID, jobTitle, companyName, salary
            Actions:
                setInfo
                getInfo
                attendMeeting
                working
        create an arraylist of Emplooyee and store 5 employee objects
        remove all employees from the list who are making less than 100K
        NO seperate classes

 */
