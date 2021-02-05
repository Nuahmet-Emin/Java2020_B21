package day43_Inheritance.personTask;

public class Employee extends Person{
    /*
    inherited:
          variables: name, age, gender
          methods: setInfo, eat, sleep, toString
     */

    public double hourlyRate;
    public String jobTitle, ID;

    public void work(){
        System.out.println(name + " is working");
    }

    public void setInfo(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name,age,gender);// method overloading, employee has 2 setInfo method
        this.hourlyRate = hourlyRate;
        this.jobTitle= jobTitle;
        this.ID = ID;
    }

    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", hourlyRate= $" + hourlyRate +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                ", salary: $" + (int)calcSalary() +
                '}';
    }

    public static String publicVariable = "public";
    protected static String protectedVariable = "protected";
    static String defaultVariable = "default";
}
/*
 Create a class called Employee
            Attributes:
                name, jobTitle, employeeID, hourlyRate, fullTime(boolean)
           Actions:
                setInfo(), work()
                calcSalary(): returns the salary. (assume that weeklyHours is 40, and there are 52 weeks in a year
                toString(): Returns (String) all the information of Employee
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */
