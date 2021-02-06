package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in); //EnterEnter
        System.out.println("Enter a price: ");
        double price = scan.nextDouble(); // 80Enter

        System.out.println("Price: " + price);

        System.out.println("Enter the name of the item: ");
        String item = scan.next(); // tomatoEnter
        System.out.println("Item: " + item);

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); //EnterEnter
        scan.close();

        System.out.println("Full name: " + fullName);








    }
}
