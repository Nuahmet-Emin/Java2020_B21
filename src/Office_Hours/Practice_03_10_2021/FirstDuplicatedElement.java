package Office_Hours.Practice_03_10_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,5,6,6,7,7)); // 3

        int result = 0;

       /* for (Integer each : list) {
            int freq = Collections.frequency(list,each);
            if( freq > 1){
                result = each;

                break;
            }
        }*/

        for(Integer each : list){
            int freq = 0;

            for(Integer each1 : list){
                if(each == each1){
                    freq++;

                }
            }
            if(freq > 1){
                result = each;
                break;
            }
        }



        System.out.println(result);



    }
}
