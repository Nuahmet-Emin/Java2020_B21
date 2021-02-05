package day28_MultiDimensionalArray;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String[] employeeNames = {"Asel", "Afrooz", "Safa", "Nurahmet", "Fatime"};
        // index number;              0      1         2        3          4

        int[] employeeSalary = {130000, 110000, 105000, 120000, 125000};
        // index                   0      1       2       3       4

        int max = employeeSalary[0];
        String nameOfMax = "";

        int min= employeeSalary[0];
        String nameOfMin = "";

        for (int i = 0; i <= employeeSalary.length - 1; i++) {
            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);
            if(max <= employeeSalary[i]){
                max = employeeSalary[i];
                nameOfMax = employeeNames[i];
            }
            if(min >= employeeSalary[i]){
                min = employeeSalary[i];
                nameOfMin = employeeNames[i];
            }

        }
        System.out.println(nameOfMax + " has the max salary: $" + max);
        System.out.println(nameOfMin + " has the minimum salary $" + min);
    }
}
/*
print name : salary
who has the highest salary
who has minimum salary
 */