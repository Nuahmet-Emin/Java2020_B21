package day33_ArrayList;

import day32_LocalDate_WrapperClass.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        DateTimeFormatter df= DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

        LocalDateTime d1 = LocalDateTime.of(2020,11,12,7,19);
        System.out.println(d1.format(df));

        System.out.println("====================================");

        //task 2.
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        LocalDate[] days = new LocalDate[10];

        for(int i=0; i<=days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println(Arrays.toString(days));
        for(LocalDate each : days){
            System.out.println(each.format(df1));
        }

        System.out.println("===============================");

        String[] friends = {"Saidullo", "Delgira", "Feyza", "Kubra", "Tamerlan"};
        LocalDate[] DofB ={
                LocalDate.of(1991,9,25),
                LocalDate.of(1981,5,25),
                LocalDate.of(1992,9,25),
                LocalDate.of(1994,9,25),
                LocalDate.of(1996,9,25),
        };

        String nameOfOlder = friends[0];
        LocalDate older = DofB[0] ;

        String nameOfYoungest = friends[0];
        LocalDate younger = DofB[0];

        for(int i=0; i<=friends.length-1;i++){
            if(DofB[i].isBefore(older)){
                older = DofB[i];
                nameOfOlder = friends[i];
            }

            if(DofB[i].isAfter(younger)){
                younger = DofB[i];
                nameOfYoungest = friends[i];
            }
        }

        System.out.println(nameOfOlder + " : " + older);
        System.out.println(nameOfYoungest + " : " + younger);









    }
}
/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each
     Date in the following format:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday
    3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
 */
