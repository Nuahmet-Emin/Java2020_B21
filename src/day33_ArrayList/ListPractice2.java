package day33_ArrayList;

import java.util.ArrayList;


public class ListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(29);
        list.add(12);
        list.add(299);
        list.add(1);
        list.add(999);

        int max = list.get(0);
        int min = list.get(0);

        for(int each :list){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("Max num: " + max);
        System.out.println("Min num: " + min);

    }
}
