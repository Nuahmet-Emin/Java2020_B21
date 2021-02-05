package day39_StaticBlock;

import day37_CustomeClass.Employee;

public class StaticBlocks {
// static block runs first all the time and run only once
    public static String company ;
    public static Employee employee1;
    public int a;
    public static int b;
    public static boolean isEmployeed;


    static{
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("John",company,"SDET","A123","M",40,55);

       // a =100; static only accept static member
        b =200;

        System.out.println("Static Block");
    }


/*
    public static void main(String[] args) {
        company = "Bank of America" ;
        employee1 = new Employee();
        employee1.setInfo("John",company,"SDET","A123","M",40,55);
        b=200;
        isEmployeed = true;

        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployeed);
    }

 */

}
