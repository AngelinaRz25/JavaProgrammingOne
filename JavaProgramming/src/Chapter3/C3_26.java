package Chapter3;

import java.util.Scanner;

/**
 * Program to test if a number is a multiple of 5 and/or 6
 *
 * @author Angelina Zheng
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Is " + number + " divisible by 5 and 6? ");
        System.out.println(number % 5 == 0 && number % 6 == 0);
        System.out.print("Is " + number + " divisible by 5 or 6? ");
        System.out.println(number % 5 == 0 || number % 6 == 0);
        System.out.print("Is " + number + " divisible by 5 or 6, but not by both? ");
        System.out.println((number % 5 == 0 || number % 6 == 0) && (number % 5 != number % 6));
    }
}
