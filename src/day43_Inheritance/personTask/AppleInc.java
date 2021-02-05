package day43_Inheritance.personTask;

public class AppleInc { // AppleInc HAS A Tester

    public static void main(String[] args) {
        Tester tester1 = new Tester("Nurahmet",32,'M',70,"SDET","A112");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary: " + tester1.calcSalary());
        tester1.testing();

        System.out.println(tester1);


        Developer developer1 = new Developer("Fatime",32,'F',70,"SDET","A122");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println("Salary: "  + developer1.calcSalary());
        System.out.println(developer1);
    }
}
