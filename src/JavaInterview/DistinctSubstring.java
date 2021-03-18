package JavaInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class DistinctSubstring {
    public static void main(String[] args) {


        String str = "abcabc";  // a,ab,b,bc

        ArrayList<String> list = new ArrayList<>();


        int res = 0;


        for(int i=0; i<=str.length(); i++){

            for(int j=i+1; j<=str.length(); j++){
                list.add(str.substring(i,j));
            }

        }
        LinkedHashSet<String> set = new LinkedHashSet<String>(list);

        for(String each : set){

            if(Collections.frequency(list,each)>1){
                if(each.length()==1){
                    res ++;
                }
            }
        }

        System.out.println(list);
        System.out.println(set);

        System.out.println(res);

    }
}
