package day29_Methods;

public class MethodWithParameter {

    public static void main(String[] args) {
        int age = 35;
        eligibleToBuyAlcohol(age);

        eligibleToBuyAlcohol(30);

        calculateAge(1987,1985);
    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }

    public static void calculateAge(int birthYear, int currentYear) {
        if(birthYear < currentYear){
            System.out.println("Your age is: " + (currentYear - birthYear));
        }else{
            System.out.println("Invalid Entry");
        }

    }

}
