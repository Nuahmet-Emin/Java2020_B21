package day50_Polymorphism;

import day47_Abstraction.EmployeeTask.Developer;
import day47_Abstraction.EmployeeTask.Employee;
import day47_Abstraction.EmployeeTask.Tester;
import day47_Abstraction.EmployeeTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Mini",23,'F',"SDET","S124",95_000),
                new Developer("Mat",23,'F',"SDET","S124",75_000),
                new Developer("Mat",23,'F',"SDET","S124",75_000),
                new Developer("Mat",23,'F',"SDET","S124",75_000),
                new Developer("Mat",23,'F',"SDET","S124",75_000),
                new Developer("Mat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
                new UberDriver("Sat",23,'F',"SDET","S124",75_000),
        };
        int countTester = 0;
        int countDeveloper = 0;
        int countUberDriver = 0;
        for(Employee eachEmployee : employees){
            if(eachEmployee instanceof Tester){
                countTester++;
            }
            if(eachEmployee instanceof Developer){
                countDeveloper++;
            }
            if(eachEmployee instanceof UberDriver){
                countUberDriver++;
            }
        }
        System.out.println(countTester);
        System.out.println("countDeveloper = "+countDeveloper);
        System.out.println("countUberDriver = " +countUberDriver);

        System.out.println("---------------------------------------");

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));
        System.out.println(scrumMembers.size());

        scrumMembers.removeIf(p-> p instanceof UberDriver);
        System.out.println(scrumMembers.size());

        System.out.println("---------------------------------------");

        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();

       // scrumMembers.forEach(each -> { if(each instanceof Tester) testers.add(each); else developers.add(each); } );


        for(Employee each : scrumMembers){
            if(each instanceof Tester){
                testers.add(each);
            }else{
                developers.add(each);
            }
        }



    }
}
