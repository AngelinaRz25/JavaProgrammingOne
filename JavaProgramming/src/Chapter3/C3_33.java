package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two packages of rice considering weight and price
 *
 * @author Angelina Zheng
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for rice package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        // compare price per lb/kg
        double rice1 = price1 / weight1;
        double rice2 = price2 / weight2;
        if (rice1 > rice2) {
            System.out.println("Package 2 has a better price.");
        }
        if (rice1 < rice2) {
            System.out.println("Package 1 has a better price.");
        }
        if (rice1 == rice2) {
            System.out.println("Two packages have the same price.");
        }

    }
}
