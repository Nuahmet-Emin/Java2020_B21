package JavaInterview;

public class FindOutDifferentLetter {

    public static void main(String[] args) {
        String result = "";
        String str1 = "This apple is sweet";
        String str2 = "This apple is not sour ";

        String[] arr1 = str1.split(" ");
        String [] arr2 = str2.split(" ");

       /* for(int i =0; i<= arr1.length-1; i++ ){
            if((!arr1[i] .equals(arr2[i]))){
                result += arr1[i] +" "+ arr2[i];
            }
        }*/



        System.out.println(result);
    }
}
