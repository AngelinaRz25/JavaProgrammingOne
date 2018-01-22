package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate and display the cost of the food, tax, tips, and the
 * full meal
 *
 * @author Angelina Zheng
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost of the entree/meal: ");
        double entreePrice = input.nextDouble();
        System.out.println("Enter the price of the drink: ");
        double drinkPrice = input.nextDouble();
        System.out.println("Enter the price of the dessert: ");
        double dessertPrice = input.nextDouble();

        double meal = entreePrice + drinkPrice + dessertPrice;
        double tax = 0.10 * meal;
        double tip = 0.15 * (tax + meal);
        double totalCost = meal + tax + tip;

        System.out.println("The price of the full meal(the food) is: "
                + (int) (meal * 100) / 100.0);
        System.out.println("Sales tax is 10%. Therefore, the tax amount is: "
                + (int) (tax * 100) / 100.0);
        System.out.println("Tip is 15%. Therefore, the tip amount is "
                + (int) (tip * 100) / 100.0);
        System.out.println("The total cost for the entire meal plus tax and tip is: "
                + (int) (totalCost * 100) / 100.0);

    }
}
