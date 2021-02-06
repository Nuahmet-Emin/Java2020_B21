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

        Priority priorityLevel = Priority.Low;
        System.out.println(priorityLevel);


        System.out.println("======================");

        // String : immutable, string pool

        // StringBuilder : mutable , not synchronized

        // StringBuffer : mutable, synchronized ==> thread safe

        String string = "Cybertek";
        string.concat(" School"); // "Cybertek School" will be collected by GC

        System.out.println(string); // "Cybertek"

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        stringBuilder.reverse();

        System.out.println(stringBuilder);

    }

}
