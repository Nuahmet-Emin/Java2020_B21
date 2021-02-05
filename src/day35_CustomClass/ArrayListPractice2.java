package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
    String[] jobTitles = {"SDET","SM","QA","Developer","PO","BA","QA","SDET"};

        ArrayList<String> jobs = new ArrayList<>();
        jobs.addAll(Arrays.asList(jobTitles));

       // jobs.retainAll(Arrays.asList("SDET","QA"));

        jobs.removeIf(p-> !p.equals("SDET") || !p.equals("QA"));

        System.out.println(jobs);

        System.out.println("===========================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("===========================================");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,6,7,8,100,200,300,400,600));

       // list.removeIf(p-> p > 100);

        // solution 2
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer each : list){
            if(each < 100){
                temp.add(each);
            }
        }
        System.out.println(temp);





    }
}

/*
task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
    task04:
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                solution 1: use lambda
                solution 2: do not use lambda

 */
