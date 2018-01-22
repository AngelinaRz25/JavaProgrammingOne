package Chapter4;

import java.util.Scanner;

/**
 * Program to compare the cost per hour of two bidders
 *
 * @author Angelina Zheng
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The details asked for below concern the first bidder.");
        System.out.print("Please enter your name: ");
        String name1 = input.next();
        System.out.print("How many hours of work will you require? ");
        int hour1 = input.nextInt();
        System.out.print("How much do you charge per hour? ");
        double rate1 = input.nextDouble();
        double cost1 = hour1 * rate1;
        System.out.print("The details asked for below concern the second bidder.");
        System.out.print("Please enter your name: ");
        String name2 = input.next();
        System.out.print("How many hours of work will you require? ");
        int hour2 = input.nextInt();
        System.out.print("How much do you charge per hour? ");
        double rate2 = input.nextDouble();
        double cost2 = hour2 * rate2;
        String winner = "";
        double winCost = 0.0;
        int winHours = 0;
        boolean x = true;

        if ((cost1 < cost2) || (cost1 == cost2 && hour1 < hour2)) {
            winner = name1;
            winCost = cost1;
            winHours = hour1;
        }
        if ((cost1 > cost2) || (cost1 == cost2 && hour1 > hour2)) {
            winner = name2;
            winCost = cost2;
            winHours = hour2;
        }
        if (cost1 == cost2 && hour1 == hour2) {
            System.out.printf("Both %s and %s have identical bids. \nNumber of hours: \nFirst bidder = %d\tSecond bidder = %d", name1, name2, hour1, hour2);
            System.out.printf("\nCost per hour: \nFirst bidder = $%.2f\tSecond bidder = $%.2f\nTotal Cost: \nFirst bidder = $%.2f\tSecond bidder = $%.2f", rate1, rate2, cost1, cost2);
            x = false;
        }
        if (x) {
            System.out.printf("The winner is %s with a total cost of $%.2f and %d hours", winner, winCost, winHours);
        }
    }
}
