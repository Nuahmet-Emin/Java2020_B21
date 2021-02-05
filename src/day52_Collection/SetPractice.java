package day52_Collection;

import java.util.*;

public class SetPractice {

    static String str3;
    public static void main(String[] args) {

        Set<String>  names1 = new HashSet<>();
        names1.addAll(Arrays.asList("Daniel","Rusal","Adnan","Serhi","Ercan","Hosang","Hosang","Hosang"));
        System.out.println(names1);

        System.out.println("===============================================");
        Set names2 = new LinkedHashSet<>(); // keeps insertion order
        String[] nameArray = {"Daniel","Rusal","Adnan","Serhi","Ercan","Hosang","Hosang","Hosang"};
        names2.addAll(Arrays.asList(nameArray));
        //names2.addAll(Arrays.asList("Daniel","Rusal","Adnan","Serhi","Ercan","Hosang","Hosang","Hosang"));
        System.out.println(names2);

        System.out.println("===============================================");
        Set<String > names3 = new TreeSet<>(); // keeps in sorted order
        names3.addAll(Arrays.asList("Daniel","Rusal","Adnan","Serhi","Ercan","Hosang","Hosang","Hosang"));
        System.out.println(names3);

        System.out.println("===============================================");
        String result = "";
        String str = "gggeeeaaaaaaaabbbbbbbbbbcccccccccddddddd";

        /*
        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += s;
        }
       */
        String[] arr = str.split("");
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(arr));
       // hs.addAll(Arrays.asList(arr));

        for(String s : hs){
            result += s;
        }

        System.out.println(result);

          //LinkedHashSet hs = new LinkedHashSet<>(Arrays.asList( str.split("")));
        //System.out.println(hs);

        System.out.println("===============================================");
          String str1 = "silent";
          String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split("") ) ).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split("") ) ).toString();

        System.out.println(s1); //[e, i, l, n, s, t]
        System.out.println(s2); //[e, i, l, n, s, t]

        System.out.println(s1.equals(s2));

        System.out.println("===============================================");

        // Null key:


        System.out.println(str3);

     //   System.out.println(str3.toUpperCase()); //NullPointerException

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null,null,null));

        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        //treeSet.addAll(Arrays.asList(null,null,null));

        //System.out.println(treeSet);

       // String str4= null;
        //System.out.println(str4.equals("Muhtar"));

        System.out.println("===============================================");

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int maximum = Collections.max(numbers);
        int minimum = Collections.min(numbers);
        System.out.println(maximum);

        System.out.println("===============================================");

        /*dddaaaaccbb
                   dacb
                   3422

        output:d3a4c2b2
         */

        String str5 = "dddaaaaccbb";
        String nonDup = "";
        String frequency = "";

        for (String s : new LinkedHashSet<>(Arrays.asList(str5.split("")))) {
            nonDup += s;
        }
        System.out.println(nonDup);

        for(String each : nonDup.split("") ){
            frequency += each + Collections.frequency(Arrays.asList(str5.split("")),each);
        }


        System.out.println(frequency);
    }
}
