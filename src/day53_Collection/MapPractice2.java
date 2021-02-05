package day53_Collection;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        TreeMap<String,Integer> scores = new TreeMap<>();
        scores.put("Dilfinar",100);
        scores.put("Nurahmet",99);
        scores.put("Aidana",98);
        scores.put("Fatime",88);
        scores.put("Jawad",82);
        scores.put("Akbar",74);
        scores.put("Munir",64);
        scores.put("Pedro",81);

        scores.replace("Jawad",79);

        List<String> earlyBirds = new ArrayList<>();
        List<String> angryBirds = new ArrayList<>();

        //scores.keySet().forEach(p -> {if(scores.get(p) >= 80) earlyBirds.add(p); else   angryBirds.add(p); } );

        for (String name : scores.keySet()) {
            int score = scores.get(name);
            if(score >= 80){
                earlyBirds.add(name);
            }else {
                angryBirds.add(name);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        System.out.println("===========================================");

        LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
        birthDays.put("Jimmy", LocalDate.of(2018,2,5));
        birthDays.put("Farzam",LocalDate.of(2010,2,2));
        birthDays.put("Dean",LocalDate.of(1995,5,19));
        birthDays.put("Muhtar",LocalDate.of(1976,5,19));
        birthDays.put("Ercan", LocalDate.of(1974,3,3));
        birthDays.put("Ayder",LocalDate.of(1989,4,4));
        birthDays.put("Ramiz",LocalDate.of(1983,3,12));

        LocalDate youngest = LocalDate.of(1900,1,1);
        String nameYoung = "";

        LocalDate oldest = LocalDate.now();
        String nameOld = "";

        for (String name : birthDays.keySet()) {
            LocalDate DOB = birthDays.get(name);
            if(DOB.isBefore(LocalDate.of(1980,1,1))) {
                System.out.println(name + " " + DOB);
            }

            if(DOB.isAfter(youngest)){
                youngest = DOB;
                nameYoung = name;
            }

            if(DOB.isBefore(oldest)){
                oldest = DOB;
                nameOld = name;
            }
        }

        System.out.println("nameYoung = " + nameYoung);
        System.out.println("Oldest = " + nameOld);

        System.out.println("===================================");

       TreeMap<String, String> countries = new TreeMap<>();
       countries.put("US","DC");
       countries.put("Russia","Moscow");
       countries.put("Germany","Berlin");
       countries.put("France","Paris");
       countries.put("East Turkistan","Urumchi");

        System.out.println(countries);

        countries.values().forEach(p-> {
            System.out.println(p.toUpperCase());
        });

        for (String value : countries.values()) {
            System.out.println(value.toUpperCase());
        }

        System.out.println("=================================");

        //verify:
        boolean b1 = countries.get("Russia").equals("Moscow");

        boolean b2 = countries.containsValue("Moscow");

        //find out the capital of Germany
        System.out.println(countries.get("Germany")    );

        // find out which country's capital is "Paris";


        for (String country : countries.keySet()) {
            String capital = countries.get(country);
            if(capital.equals("Paris")){
                System.out.println(country);
            }
        }

        System.out.println("----------------------------");

        // find out the which country's capitol is "DC"

        countries.keySet().forEach(p-> {if(countries.get(p).equals("DC")) System.out.println(p  );});

        System.out.println("----------------------------");

        LinkedHashMap<String, Integer> sdets = new LinkedHashMap<>();

        sdets.put("Afrooz",150000);
        sdets.put("Alim",150000);
        sdets.put("Ayse",125000);

        for (String key : sdets.keySet()) {
            Integer value = sdets.get(key);
            sdets.replace(key,value + 500);
        }
        System.out.println("SDETS = " + sdets);

    }
}
//Tasks:
//    1. create a map that can contain student name and student' score
//            put 5 of your friends names and thier scores
//            print out the names of the students who made less than 80
//    2. create a map that can contains name and Date Of Birth.
//            put 5 of your classmates' names and thier date of birth
//            print out the names of the students who were born before 1980 January 1st
//    3. create a map that can contain names of counties and thier capitals
//                use for each loop to print out all the capitals