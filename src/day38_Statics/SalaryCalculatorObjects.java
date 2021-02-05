package day38_Statics;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator object1 = new SalaryCalculator();
        object1.setInfo(55,40,8,22);
        System.out.println(object1);

        SalaryCalculator object2 = new SalaryCalculator();
        object2.setInfo(55,40,8,22);

        System.out.println(object1.equals(object2));

    }
}
