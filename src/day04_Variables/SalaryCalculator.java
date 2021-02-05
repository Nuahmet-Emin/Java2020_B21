package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 100000;
        double taxRate = 0.28;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your total tax will be: " + totalTax);
        System.out.println("Your salary after tax is: " + salaryAfterTax);



    }
}
