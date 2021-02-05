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
    }
}
