package day47_Abstraction.EmployeeTask;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    public void work(){
        System.out.println("Developer is writing code");
    }

    public void sleep(){
        System.out.println("Developers sleeps 6 horus");
    }
}
