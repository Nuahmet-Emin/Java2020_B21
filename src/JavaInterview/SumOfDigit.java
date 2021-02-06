package JavaInterview;

public class SumOfDigit {

    public static void main(String[] args) {
        String str = "a1b2c3";
        System.out.println("Sum of digits in " + str + " : " + sumOfDigitsInString(str));
    }

    public static int sumOfDigitsInString(String str){ //a1b23c

        int sumOfDigits = 0;
        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
              // sumOfDigits += str.charAt(i);
                sumOfDigits +=  Integer.valueOf(str.charAt(i)+"");
            }
        }
        return sumOfDigits;
    }
}
//Write a method that can return the sum of the digits in a string
