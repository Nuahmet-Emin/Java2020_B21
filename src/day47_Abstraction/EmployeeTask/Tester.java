package day47_Abstraction.EmployeeTask;

public final class Tester extends Employee {
    public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }
  @Override
  public void work(){
      System.out.println("Tester works 8 hours testing applications");
  }
  @Override
  public void sleep(){
      System.out.println("Tester sleeps 7 hours");
  }

  public void smokeTesting(){
      System.out.println("Smoke testing");
  }

}
