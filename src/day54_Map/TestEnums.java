package day54_Map;

public class TestEnums {
    public static void main(String[] args) {

        // Enum : fixed set of constants

        // we use it when we need to take one out from a small

        String browserName= "Cybertek";

        Browsers browsersName2 = Browsers.Chrome;

        switch (browsersName2){
            case Chrome:
                System.out.println("Chrome is selected");
                break;

            case FireFox:
                System.out.println("Firefox is selected");
                break;

            default:
                System.out.println("");
        }

    String monthName = "Python";
        MonthName monthName2 = MonthName.Jan;

        DaysInWeek day = DaysInWeek.Fri;

        ComputerOS os = ComputerOS.MacOS;


    }
}
