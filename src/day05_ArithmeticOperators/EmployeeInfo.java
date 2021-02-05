package day05_ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Nurahmet";
        String lastName = "Azat";
        String fullName = firstName + " " + lastName;
        char gender = 'M';
        int age = 30;
        String companyName = "Bank of East Turkistan";
        String jobTitle = "Software Developer";
        double salary = 150000;
        boolean isFulltime = true;

        System.out.println("Employee full name is: " + fullName);
        System.out.println("Gender is: " + gender);
        System.out.println(fullName + " age is " + age);
        System.out.println(fullName + " works at " + companyName + " and job title is " + jobTitle);
        System.out.println(fullName + "'s annual salary is $" + salary );
        System.out.println(fullName + " works as full time: "+ isFulltime);





    }
}
