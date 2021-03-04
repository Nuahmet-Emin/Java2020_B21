package JavaInterview;

public class MostFrequentLetter {

    public static void main(String[] args) {
        String str = "aaaabbaccc";
        String nonDup = "";
        String result ="";


        for(int i=0; i<= str.length()-1; i++ ){
            if(!nonDup.contains(str.charAt(i)+"")){
                nonDup += str.charAt(i);
            }
        }



        int max = 0;


        for(int i=0; i<=nonDup.length()-1; i++){
            int count =0;
            char ch = nonDup.charAt(i);
            for(int j=0; j<=str.length()-1; j++){
                if(ch == str.charAt(j)){
                    count ++;
                }
            }
            if(count > max){
                max = count;
                result = max + "" + nonDup.charAt(i);
            }
        }
        System.out.println(result);


    }
}
