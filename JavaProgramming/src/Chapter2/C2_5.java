package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate and display tips to the console given a specified
 * subtotal and rate
 *
 * @author Angelina Zheng
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        double gratuity = (rate / 100) * subtotal;
        double total = subtotal + gratuity;
        System.out.print("The gratuity is $ " + (gratuity * 100) / 100.0
                + " and total is $ " + (total * 100) / 100.0);
    }
}
