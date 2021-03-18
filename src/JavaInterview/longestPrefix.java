package JavaInterview;

import java.util.Arrays;

public class longestPrefix {

    public static void main(String[] args) {
        String[] arr = { "min","mineral", "mint"};

        String res = "";
        Arrays.sort(arr);
        boolean terminate= false;

        System.out.println(Arrays.toString(arr));
        //[min, mineral, mint]
       // String firstWord = arr[0];
        for(int i=0; i<= arr[0].length()-1; i++){
            char ch = arr[0].charAt(i);
            for(String each : arr){
                if(each.charAt(i) == ch){
                    continue;
                }else{
                    terminate = true;
                    break;
                }
            }
            if(terminate == true){
                System.out.println("There is no common prefix");
                break;
            }
            res += ch;

        }

        System.out.println(res);

    }
}
