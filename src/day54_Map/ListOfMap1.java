package day54_Map;

import java.util.*;

public class ListOfMap1 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Fatih", "Team leader");
        scrum1.put("Aziz", "Developer");
        scrum1.put("Nalan", "Tester");
        scrum1.put("Gulbahar", "Tester");
        scrum1.put("Ana", "Developer");
        scrum1.put("Walid", "Tester");
        scrum1.put("Awet", "Developer");
        scrum1.put("Khaled", "Developer");
        scrum1.put("David", "Scrum master");

        LinkedHashMap<String, String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Khrystyna" , "PO");
        scrum2.put("Meredith" , "Automation Tester");
        scrum2.put("Nikola" , "BA");
        scrum2.put("Mariana" , "SM");
        scrum2.put("Fatih" , "Manual Tester");
        scrum2.put("Viktoriya" , "Developer");
        scrum2.put("Bayana" , "SDET");
        scrum2.put("Ruslan" , "SDET");

        LinkedHashMap<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Diana" , "PO");
        scrum3.put("Muhammad" , "Automation Tester");
        scrum3.put("Ayah" , "BA");
        scrum3.put("Angelina" , "SM");
        scrum3.put("Saltanat" , "Manual Tester");
        scrum3.put("Mustafaa" , "Developer");
        scrum3.put("Severa" , "SDET");
        scrum3.put("Volkan" , "SDET");

        LinkedHashMap<String, String> scrum4 = new LinkedHashMap<>();
        scrum4.put("Omer","Developer");
        scrum4.put("Dragisa","BA");
        scrum4.put("Gulistan","SM");
        scrum4.put("Natalie","PO");
        scrum4.put("Sladjan","SDET");
        scrum4.put("Abiel","Developer");
        scrum4.put("Alex","SDET");
        scrum4.put("Ghalip","Developer");
        scrum4.put("Abishek","Developer");
        scrum4.put("Khojasta","SDET");
        scrum4.put("Marina","Developer");

        List<Map<String, String>> listOfMaps = new ArrayList<>();
        listOfMaps.addAll(Arrays.asList(scrum1,scrum2,scrum3,scrum4));

        System.out.println(listOfMaps);

        System.out.println("=========================================");

        for(Map<String ,String> eachMap : listOfMaps){
           for(Map.Entry<String,String > eachPair: eachMap.entrySet()  ){
               if(eachPair.getValue().equals("SM")){
                   System.out.println(eachPair.getKey());
               }
              // System.out.println(eachPair.getKey() + " : " + eachPair.getValue());

           }
        }
        System.out.println("=========================================");

        //print all the developers names
        for(int i =0; i<= listOfMaps.size()-1; i++){
            Map<String,String> eachMap = listOfMaps.get(i);
            for(String eachKey : eachMap.keySet()){

            }
        }


    }
}
