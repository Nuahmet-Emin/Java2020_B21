package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String[] employeeNames = {"Asel", "Afrooz", "Safa", "Nurahmet", "Fatime", "Aliya", "Bektemir", "Pedro"};
        int[] employeeSalary =   {125000, 110000,   105000,   120000,    125000,   125000,   12500, 100000};

        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each > max){
                max =each;
            }
        }
        System.out.println("Max: " + max);

        for(int i=0; i<=employeeSalary.length-1; i++){
            if(max == employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }


    }
}
