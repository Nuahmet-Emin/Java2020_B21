package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {

        LocalDate DofB = LocalDate.of(1988,2,5);

        DofB.getDayOfMonth();
        DofB.getDayOfYear();

    }

    public static void HappyBirthDay(LocalDate DofB){

    }
}
