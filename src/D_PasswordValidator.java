/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        /* TODO: your code goes here */
        //boolean to find whether there is an uppercase
        boolean upperCheck = password.equals(password.toLowerCase());
        //boolean to check if there is a number. CITATION: Oracle String Website
        boolean numberCheck = password.matches(".*[0-9].*");
        //Boolean to chek if password is the password, CITATION: ORACLE STRING WEBSITE
        boolean hasPwd = password.toLowerCase().contains("password");
        // CHECK IF VALID
        if (!(upperCheck) && numberCheck && !(hasPwd)) {
            return true;
        }

        return false;



    }
}
