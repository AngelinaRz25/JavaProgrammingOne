package Chapter8;

import java.util.Scanner;

/**
 * Program to record and display total sales
 *
 * @author Angelina Zheng
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] weekSales = new double[4][7];
        char[] salesman = {'A', 'B', 'C', 'D'};
        char[] day = {'M', 'T', 'W', 'H', 'F'};
        String answer = "y";
        int row = 0;
        int column = 0;

        do {
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D: ");
                row = linearSearch(salesman, input.next().charAt(0));
            } while (row == -1);
            do {
                System.out.print("Enter the day as M, T, W, H, or F: ");
                column = linearSearch(day, input.next().charAt(0));
            } while (column == -1);
            System.out.print("Enter the amount of the sale: ");
            weekSales[row][column] += input.nextDouble();
            do {
                System.out.print("More data? Enter Y for more or N to stop. ");
                answer = input.next();
            } while (!(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("y")));
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Salesman       M       T       W       H       F");
        for (row = 0; row < 4; row++) {
            System.out.print(salesman[row] + "\t\t");
            for (column = 0; column < 5; column++) {
                System.out.print(weekSales[row][column] + "\t");
            }
            //goes to next line for next row
            System.out.print("\n");
        }
    }

    /**
     * Method to search through an array
     *
     * @param list an array
     * @param key the int value being searched for
     * @return an int value
     */
    public static int linearSearch(char[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
