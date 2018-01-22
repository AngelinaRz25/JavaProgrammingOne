package Chapter6;

import java.util.Scanner;

/**
 * Program to convert specified amount of currency to another form of currency
 *
 * @author Angelina Zheng
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double currencyRate;
        String response = "";
        String currName;
        System.out.print("How many Euros does a dollar buy?");
        double euros = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy?");
        double pound = input.nextDouble();
        System.out.print("How many Yen does a dollar buy?");
        double yen = input.nextDouble();
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double amount = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String type = input.next();
            if (type.equalsIgnoreCase("e")) {
                currencyRate = euros;
                currName = "Euros";
            } else if (type.equalsIgnoreCase("p")) {
                currencyRate = pound;
                currName = "Pound Sterlings";
            } else if (type.equalsIgnoreCase("y")) {
                currencyRate = yen;
                currName = "Yen";
            } else {
                continue;
            }

            conversion(amount, currencyRate, currName);
            System.out.print("Are there more conversions to perform? ");
            response = input.next();
            while (!(response.equalsIgnoreCase("yes")) && !(response.equalsIgnoreCase("no"))) {
                System.out.print("Enter \"yes\" to continue or \"no\" to stop: ");
                response = input.next();
            }
        } while (!(response.equalsIgnoreCase("no")));
    }

    /**
     * Method to convert currency and print resulting currency
     *
     * @param startCurrency double variable of the starting amount of money to
     * be converted
     * @param rate double variable of the rate of currency exchange
     * @param name string name of the type of currency to be converted to
     */
    public static void conversion(double startCurrency, double rate, String name) {
        double endCurrency;
        if (startCurrency < 100) {
            endCurrency = startCurrency * (1 - 0.1) * rate;
        } else {
            endCurrency = startCurrency * (1 - 0.05) * rate;
        }
        System.out.printf("For %.2f dollars, you will be able to buy %.2f %s.\n", startCurrency, endCurrency, name);
    }
}
