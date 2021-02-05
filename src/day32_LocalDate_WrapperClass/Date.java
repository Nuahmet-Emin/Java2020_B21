package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

        //LocalDate d1 = LocalDate.of(2020,2,30);
        //System.out.println(d1);

        System.out.println( yesterday.isLeapYear() ); // Leap ==> true, otherwise ==> false

        LocalDate today = LocalDate.now();

        System.out.println(today);

        // LocalDate DofB

        String[] names = {"Nurahmet", "Fatime","Dilfinar","Aidana"};
        LocalDate[] birthDays = {
                LocalDate.of(2000,01,01 ),
                LocalDate.of(2001,2,1),
                LocalDate.of(2016,3,1),
                LocalDate.of(2017,4,1)
        };

        for(int i=0; i<=names.length-1; i++){
            System.out.println(names[i] + "' birthday is: " + birthDays[i]);
            System.out.println(names[i] + " was born on leap year: " + birthDays[i].isLeapYear());
        }


    }
}
