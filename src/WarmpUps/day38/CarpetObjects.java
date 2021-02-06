package WarmpUps.day38;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = { new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5,7,15,false);
        carpets[1].customOrder(3,4,50,false);
        carpets[2].customOrder(4,5,100,true);
        carpets[3].customOrder(5,5,50,false);
        carpets[4].customOrder(6,8,200,true);

        System.out.println(carpets[0]);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p->p.isPersian == false);

        for(Carpet each : persianCarpets){
            System.out.println(each);
        }

        //System.out.println(persianCarpets);

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        regularCarpets.removeIf(p->p.isPersian == true);

    }
}
/*
  create a class called carpetObjects, and create an array of the carpet that contains 5 carpet
   objects ( make sure you set the instance variables of those objets)

   create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets,
            and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */
