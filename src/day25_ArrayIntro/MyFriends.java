package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int number = scan.nextInt();

        String firstName[] = new String[number];
        String lastName[] = new String[number];

        for(int i=0; i< number; i++){ // used for initializing
            System.out.println("Enter first name: ");
            //firstName[i] = scan.next();
            String f = scan .next();
            f= f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
            firstName[i]= f;

            System.out.println("Enter last name: ");
            //lastName[i] = scan.next();
            String l = scan.next();
            l = l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase();
            lastName[i] = l;
        }
        scan.close();

        for(int i=0; i< number; i++){ // used for printing out the elements in the arrays
            System.out.println(firstName[i] + " " + lastName[i]);
        }




    }
}
