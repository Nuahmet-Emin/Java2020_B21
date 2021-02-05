package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice2 {
    public static void main(String[] args) {


        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");
        LocalDate DofB = LocalDate.of(1988, 9, 13);

        //10 years ago:
        int age1 = LocalDate.now().minusYears(10).getYear() - DofB.getYear();

        System.out.println("10 years ago you were: " + age1 + " years old");

        System.out.println("================================================");

        LocalDate dateOfBirth = LocalDate.of(1987, 9, 13);
        System.out.println("You were born on : " + dateOfBirth.format(df));

        int currentAge = LocalDate.now().getYear() - dateOfBirth.getYear();

        if(currentAge >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            LocalDate eligible = LocalDate.of( LocalDate.now().plusYears(21-currentAge).getYear(), dateOfBirth.getMonthValue(),dateOfBirth.getDayOfMonth());
            //                                        2020 + 6
            System.err.println("You will be eligible to buy alcohol on : " + eligible.format(df));
        }

    }
}
