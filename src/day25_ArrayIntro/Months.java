package day25_ArrayIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", " Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        System.out.println(month[num-1]);



    }
}

