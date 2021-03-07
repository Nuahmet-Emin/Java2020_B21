package JavaInterview;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars(str));
    }

    public static String FrequencyOfChars(String str){
        String result = "";

        String nonDup = "";

        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(!nonDup.contains(ch + "")){
                nonDup += ch; //"ABCD"
            }
        }

        System.out.println(nonDup);

//        for( int j=0;j < nonDup.length(); j++) {
//            int count = 0;
//            for(int i=0; i < str.length(); i++) {
//                if(str.charAt(i) == nonDup.charAt(j))
//                    count++;
//            }
//
//            result +=nonDup.charAt(j)+"" + count;
//
//        }
        for(int i=0; i<= nonDup.length()-1; i++){
            int count = 0;
            for(int j=0; j<=str.length()-1; j++){
                if(  str.charAt(j) == nonDup.charAt(i)){
                    count++;
                }
            }
            result +=  nonDup.charAt(i)+ "" + count;
        }

        return result;
    }

}
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */