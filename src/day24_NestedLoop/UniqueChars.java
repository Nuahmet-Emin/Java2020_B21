package day24_NestedLoop;

public class UniqueChars {
    public static void main(String[] args) {

        String str = "AABCCD";

        for(int index =0; index <= str.length()-1; index++){ // iterate the char one at a time

            int frequency = 0;

            //charAt(index) --> A


            for(int inner = 0; inner <=str.length()-1; inner++){
                //charAt(inner) --> A A l;
                if(str.charAt(index) == str.charAt(inner)){
                    frequency ++;
                }


            }
            if(frequency == 1){
                System.out.println(str.charAt(index));
            }

        }




    }
}
/*
3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of
                    the character is equal to 1, it means it's unique

 */