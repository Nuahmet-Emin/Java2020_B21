package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "Nurahmet"; // "a, b, a, b"

        String nonDup = ""; // "a"

        for(int i =0; i<=str.length()-1; i++){
            String eachChar = ""+str.charAt(i);
            if(nonDup.contains(eachChar)){
              continue;
            }else{
                nonDup += str.charAt(i);
            }
        }

        System.out.println(nonDup);
    }
}

