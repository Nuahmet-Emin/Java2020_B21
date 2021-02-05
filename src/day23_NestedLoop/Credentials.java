package day23_NestedLoop;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your user name: ");
        String username = scan.next();

        System.out.println("Please enter you password: ");
        String password = scan.next();

        if(username.equals("cybertek") && password.equals("cybertek123")){
            System.out.println("Logged in");
        }else{
            for(int i = 1; i<=3; i++){ // 1 , 2, 3
                if(i == 3){
                    System.err.println("Your account is locked");
                    System.exit(0);
                }
                System.out.println("Invalid username or password, please re-enter");
                System.out.println("Enter your username: ");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();

                if(username.equals("cybertek") && password.equals("cybertek12345")) {
                    System.out.println("Logged in");
                    break;
                }

            }
        }



        
    }

}
