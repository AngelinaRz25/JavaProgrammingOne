package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to fill an array
 *
 * @author Angelina Zheng
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read?: ");
        int length = input.nextInt();
        int[] numbers = new int[length];
        fillArray(numbers);
        System.out.println("The average is " + average(numbers));
        print(numbers);
    }

    /**
     * Method to fill an array
     *
     * @param array an empty int array
     */
    public static void fillArray(int[] array) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + array.length + " elements: ");
        for (int x = 0; x < array.length; x++) {
            array[x] = input.nextInt();
        }
    }

    /**
     * Method to find the average of the array
     *
     * @param array an int array
     * @return the average value in the int array
     */
    public static double average(int[] array) {
        int total = 0;
        for (int x = 0; x < array.length; x++) {
            total = total + array[x];
        }
        double average = total / array.length;
        return average;
    }

    /**
     * Method to display array to Console
     *
     * @param array an int array
     */
    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
