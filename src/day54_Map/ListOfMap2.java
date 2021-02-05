package day54_Map;

import java.time.LocalDate;
import java.util.*;

public class ListOfMap2 {
    public static void main(String[] args) {

        String[] familyMembers = {"Nurahmet","Fatime","Dilfinar","Aidana","Azat"};
        LocalDate[] DOBFamilyMember = {LocalDate.of(1988,9,13), LocalDate.of(1989,1,1),LocalDate.of(2016,10,03), LocalDate.of(2019,8,7) , LocalDate.of(1999,3,3)};

        String[] classMates = {"Jerry","Karim","Merk","Clark"};
        LocalDate[] DOBClassMates = {LocalDate.of(1995,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};
        String[] friends = {"Erik","Kahri","Morh","Jonny"};
        LocalDate[] DOBFriends = {LocalDate.of(1997,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(
             new LinkedHashMap<>(), // family
             new LinkedHashMap<>(), // classmate
             new LinkedHashMap<>() // friends
        ));

        for (int i=0; i<= familyMembers.length-1; i++){
            listOfMap.get(0).put(familyMembers[i],DOBFamilyMember[i]);
        }

        for (int i=0; i<= classMates.length-1; i++){
            listOfMap.get(1).put(classMates[i],DOBClassMates[i]);
        }

        for (int i=0; i<= friends.length-1; i++){
            listOfMap.get(2).put(friends[i],DOBFriends[i]);
        }

        System.out.println(listOfMap);

        System.out.println("===================================");

        //prints family members name and DOB born before 1994

        for (Map.Entry<String, LocalDate> each : listOfMap.get(0).entrySet()) {
            String eachName = each.getKey();
            LocalDate eachDOB = each.getValue();

            if (eachDOB.isBefore(LocalDate.of(1994,1,1))){
                System.out.println(eachName);
            }
        }

        System.out.println("===================================");
        String[] modelOfToyota = {"Camry","Rav4","Corolla","Land Cruiser"};
        Integer[] yearOfToyota = {2001, 2011, 1961, 2021};

        String[] modelOfBMW = {"M1","M3","M5","X5","X6"};
        Integer[] yearOfBMW = {1995, 2005, 2015, 2020,2012};

        String[] modelOfMercedes = {"C-Class","A-Class","SLS","GLC"};
        Integer[] yearOfMercedes = {1990, 1995, 2015, 2021};

        List<Map<String, Integer>> carCollection = new ArrayList<>();
        carCollection.addAll(
                Arrays.asList(
                        new TreeMap<>(), // mercedes
                        new TreeMap<>(), // toyota
                        new TreeMap<>() // bmw
                )
        );
        for(int i=0; i<= modelOfToyota.length-1; i++){
            carCollection.get(0).put(modelOfToyota[i], yearOfToyota[i]);
        }

        for(int i=0; i<= modelOfMercedes.length-1 ; i++){
            carCollection.get(1).put(modelOfMercedes[i],yearOfMercedes[i]);
        }

        for(int i=0; i<= modelOfBMW.length-1 ; i++){
            carCollection.get(2).put(modelOfBMW[i],yearOfBMW[i]);
        }

        System.out.println(carCollection);

        for (int i=0; i< carCollection.size(); i++) {
            Map<String, Integer> eachMap = carCollection.get(i);
            for (Map.Entry<String, Integer> eachPair : eachMap.entrySet()) {
                int year = eachPair.getValue();
                if(i==0){ // toyota
                    if(year>= 1960 && year <= 1970){
                        System.out.println(eachPair);
                    }
                }else if(i == 1){ // Mercedes
                    if(year >= 1990 && year <= 1998){
                        System.out.println(eachPair);

                    }
                }else if(i == 2){ // BMW
                    if(year >= 2011 && year <= 2015){
                        System.out.println(eachPair);
                    }
                }

            }
        }


        System.out.println("==============================================");

       /* for(Map.Entry<String, Integer> eachCar : carCollection.get(0).entrySet()){
            String model = eachCar.getKey();
            Integer year = eachCar.getValue();

            if(year >= 1960 && year <= 1970){
                System.out.println("Your Toyota model: " + model +" ," + year+ " is eligible to recall");
            }
        }


        for(Map.Entry<String, Integer> eachCar : carCollection.get(1).entrySet()){
            String model = eachCar.getKey();
            Integer year = eachCar.getValue();

            if(year >= 1990 && year <= 1998){
                System.out.println("Your Mercedes model: " + model +" ," + year+ " is eligible to recall");
            }
        }

        for(Map.Entry<String, Integer> eachCar : carCollection.get(2).entrySet()){
            String model = eachCar.getKey();
            Integer year = eachCar.getValue();

            if(year >= 2011 && year <= 2015){
                System.out.println("Your BMW model: " + model +" ," + year+ " is eligible to recall");
            }
        }*/


        /*
        eligible to recall:
             BMW :
                  2011-2015
             Mercedes:
                  1990- 1998
             Toyota:
                  1960-1970

         */




    }
}
