package Chapter7;

import java.util.Scanner;

/**
 * Program to find the minimum number out of 10 entered numbers
 *
 * @author Angelina Zheng
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int x = 0; x < 10; x++) {
            numbers[x] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Method to find the minimum value
     *
     * @param array a double array of numbers
     * @return minimum value
     */
    public static double min(double[] array) {
        double min = array[0];
        for (double value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
