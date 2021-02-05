package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5,7,5,false);
        carpets[1].customOrder(5,7,5,true);
        carpets[2].customOrder(8,10,12,true);
        carpets[3].customOrder(10,15,13,true);
        carpets[4].customOrder(15,20,20,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);

        System.out.println("=========================================");
        double totalPriceOfPersianCarpet =0;
        for(Carpet each : persianCarpets){
            System.out.println(each);
            totalPriceOfPersianCarpet += each.calcCost();
        }

        System.out.println("Total of Persian: $" + totalPriceOfPersianCarpet);

        System.out.println("=========================================");
        double totalPriceOfRegularCarpet =0;
        for(Carpet each : regularCarpets){
            System.out.println(each);
            totalPriceOfRegularCarpet += each.calcCost();
        }

        System.out.println("Total of Regualr: $" + totalPriceOfRegularCarpet);

    }
}
