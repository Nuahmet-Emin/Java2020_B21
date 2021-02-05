package day07_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = 2020 % 4 == 0;
        // 2020 % 4 < 1
        System.out.println(year + " is leap year: " + isLeapYear);


    }
}
