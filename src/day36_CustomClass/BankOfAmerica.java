package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {

    public static void main(String[] args) {
        String companyName = "BoA";
        Employee[] employees = {
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee(),
                new Employee()
        };

        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 4, 15));
        employees[1].setInfo("Brad Pitt", 'M', "Scrum Master", companyName, 140_000, "0003", LocalDate.of(2016, 9, 14));
        employees[2].setInfo("Obi-Wan Kenobi", 'M', "BA", companyName, 164000, "3-CPO", LocalDate.of(2010, 2, 14));
        employees[3].setInfo("Ercan Civi", 'M', "SDET", companyName, 164000.50, "ABC123", LocalDate.of(2000, 2, 14));
        employees[4].setInfo("John Snow", 'M', "CEO", companyName, 240_000, "0004", LocalDate.of(2006, 2, 18));

        for (Employee each : employees) {
            each.getInfo();
        }
        System.out.println("============================================================");

        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(employees));
        list.removeIf(p -> p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("Developer"));

        for (Employee each : list) {
            System.out.println(each.name + " : " + each.jobTitle + ", $" + each.salary);
        }
        System.out.println("============================================================");

        ArrayList<Employee> Employee200 = new ArrayList<>();
        Employee200.addAll(Arrays.asList(employees));
        //for(Employee each : employees) Employee200.add(each);

        Employee200.removeIf(p -> p.salary < 200000);

        System.out.println("============================================================");


        double maxSalary = employees[0].salary;
        String name = "";

        for (Employee each : employees) {
            maxSalary = Math.max(maxSalary, each.salary);
            name = each.name;

        }
        System.out.println(name + " : "+maxSalary);

    }
}
