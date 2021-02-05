package day33_ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {

        String str = "a1b2c3";
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.valueOf("" + each);//Integer.parseInt("" + each);
            }
        }
        System.out.println("Sum:" + sum);

        System.out.println("========================================================");

        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digit = "";
        String specialChar = "";

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperLetters += "" + each;
            } else if (Character.isLowerCase(each)) {
                lowerLetters += "" + each;
            } else if (Character.isDigit(each)) {
                digit += each;
            } else {
                specialChar += each;
            }
        }

        System.out.println(upperLetters);
        System.out.println(lowerLetters);
        System.out.println(digit);
        System.out.println(specialChar);

        boolean valid = password.length() >= 8 && upperLetters.length() > 0 && lowerLetters.length() > 0 &&
                digit.length() > 0 && specialChar.length() > 0;

        System.out.println(valid);
    }
}
