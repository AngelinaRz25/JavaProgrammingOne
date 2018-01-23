package Chapter6;

import java.util.Scanner;

/**
 * Program to check password given by user
 *
 * @author Angelina Zheng
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.next();
        if (checkLength(password) && consistsOf(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }

    /**
     * Method which checks that the length of the password is at least 8
     * characters and returns validity of password
     *
     * @param p the string password the user enters after prompted
     * @return boolean value of true or false
     */
    public static boolean checkLength(String p) {
        if (p.length() >= 8) {
            return true;
        } else {
            System.out.println("A password must consist of at least eight characters");
            return false;
        }
    }

    /**
     * Method which checks to see if the password consists of only digits and
     * letters
     *
     * @param p the string password the user enters after prompted
     * @return boolean value of true or false
     */
    public static boolean consistsOf(String p) {
        int count = 0, numDigits = 0;
        for (int i = 0; i < p.length(); ++i) {
            if (Character.isDigit(p.charAt(i))) {
                numDigits++;
            }
            if (Character.isLetter(p.charAt(i)) || Character.isDigit(p.charAt(i))) {
                count++;
            }
        }
        if (count != p.length()) {
            System.out.println("A password must consist of only letters and digits.");
        }
        if (numDigits < 2) {
            System.out.println("A password must contain at least two digits.");
        }
        if (count == p.length() && numDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
