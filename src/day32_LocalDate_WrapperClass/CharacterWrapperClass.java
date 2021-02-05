package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {
        char n = 'w';

        System.out.println(  Character.isDigit(n)  );
        System.out.println( Character.isLetter(n));

        String str = "a1b2c34c5d6T@#$%&*^p%";
        String digits = "";
        String letters = "";
        String specialChar="";

        for(char each : str.toCharArray()){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChar +=each;
            }
        }

        System.out.println("Digists = " + digits);
        System.out.println("Letters = " +letters);
        System.out.println("Special characters = " + specialChar);



    }
}
