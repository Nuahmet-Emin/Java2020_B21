package JavaInterview;

import java.util.Arrays;

public class longestPrefix {

    public static void main(String[] args) {
        String[] arr = { "m","mineral", "mint"};

        String res = "";
        Arrays.sort(arr);

        if(arr[0].length()==0){
            System.out.println("There is no common prefix");
        }

        for(int i=0; i<= arr[0].length()-1; i++){

                if(arr[0].charAt(i) == arr[arr.length-1].charAt(i)){
                    res  += arr[0].charAt(i);
                }else{

                    break;
                }
        }
        System.out.println(res  );


    }
}
