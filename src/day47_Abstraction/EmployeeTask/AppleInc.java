package day47_Abstraction.EmployeeTask;

public class AppleInc {
    public static void main(String[] args) {
       // Person person = new Person("Person A",29,'M'); can not create object from abstract class

        Tester tester = new Tester("Mini",23,'F',"SDET","S124",95_000);
        Developer developer = new Developer("Mat",23,'F',"SDET","S124",75_000);
        UberDriver uberDriver = new UberDriver("Sat",23,'F',"SDET","S124",75_000);

        tester.work();
        tester.sleep();
        System.out.println(tester.salary);

        developer.work();
        developer.sleep();
    }
}
