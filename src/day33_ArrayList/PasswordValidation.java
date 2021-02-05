package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "password#7";

        boolean atLeast8Chars = password.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChar = false; //_ . ! @

        for (int i = 0; i <= password.length() - 1; i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigits = true;
            } else {
                hasSpecialChar = true;
            }
        }
        boolean valid = atLeast8Chars && hasUpperCase && hasLowerCase && hasDigits && hasSpecialChar;

        System.out.println(valid);


    }
}
