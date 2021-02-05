package day53_Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, Double > employeeInfo= new LinkedHashMap<>();
        employeeInfo.put("Afrooz",120000.0);
        employeeInfo.put("Athan", 120000.0);
        employeeInfo.put("Ayse",110000.0);


        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);

        //get method to get value of key
        System.out.println("Salary of Athan: " + employeeInfo.get("Athan"));
        System.out.println("Salary of Afrooz: " + employeeInfo.get("Afrooz"));

        //remove method to remove a pair of element by
        //employeeInfo.remove("Afrooz");

        //containsKey(Key)
        System.out.println(employeeInfo.containsKey("Afrooz"));
        System.out.println(employeeInfo.containsKey("Athan"));

        //containsValue(value)
        System.out.println(employeeInfo.containsValue(120000.0));

        //clear(): clears everything, size will be 0
       // employeeInfo.clear();
        System.out.println(employeeInfo);

        //isEmpty(): returns boolean


        System.out.println("=================================");
        //keySet(): returns all the keys from a map
        for (String eachKey : employeeInfo.keySet()) {
            System.out.println(eachKey + " : "+ employeeInfo.get(eachKey));
        }

        System.out.println("=================================");

        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",115000.0);
        employeeInfo.put("Apo",100000.0);

        double max = Double.MIN_VALUE, min =Double.MAX_VALUE;
        String nameMax ="", nameMin = "";

        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary > max){
                max = eachSalary;
                nameMax = eachName;
            }
            if(eachSalary < min){
                min = eachSalary;
                nameMin = eachName;
            }
        }

        System.out.println(nameMax + ":" + max);
        System.out.println(nameMin  + ":" + min);

        System.out.println("=================================");
        System.out.println(employeeInfo);

        /*employeeInfo.values().forEach(p->{
            System.out.println(p);
        });*/

        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }

        List<Double> salaries = new ArrayList<>(employeeInfo.values())  ;
        System.out.println(salaries);





    }

}
