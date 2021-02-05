package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nurahmet {

    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(new Offer(), new Offer(), new Offer(), new Offer(), new Offer()));

        offers.get(0).setInfo("CA","SDET","CapitalOne",120000,true,true,false,false);
        offers.get(1).setInfo("VA","QA","Apple",115000,true,true,false,false);
        offers.get(2).setInfo("PB","SM","Amex",100000,true,true,true,true);
        offers.get(3).setInfo("NY","SDET","Boston Dynamics",120000,true,true,true,true);
        offers.get(4).setInfo("TX","SDET","Dynamics",120000,true,true,true,true);;


        /*
        for(int i=0; i<=offers.size()-1;i++){
            offers.get(i).getInfo();
        }
         */
        System.out.println("=========================================");




        for(Offer each : offers){
            if(each.location.equals("VA")){
               each.getInfo();
            }
        }

        System.out.println("=========================================");
        ArrayList<Offer> localOffers = new ArrayList<>(offers);
        localOffers.removeIf(p->!p.location.equals("VA")); // retain if offer is from VA
        System.out.println("VA offers: " + localOffers.size());

        System.out.println("=========================================");

        ArrayList<Offer> sdetOffers = new ArrayList<>(offers);
        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET"));

        System.out.println("SDET offers: " + sdetOffers.size());

        System.out.println("=========================================");

        ArrayList<Offer> goodSalary = new ArrayList<>();
        goodSalary.removeIf(p->p.salary<120000); // remove all offer has salary less then 120000

        System.out.println("=========================================");

        ArrayList<Offer> fullTime = new ArrayList<>(offers);
        fullTime.removeIf(p->!p.isFulltime);
        System.out.println("Fulltime offers: " +fullTime.size());


    }
}
