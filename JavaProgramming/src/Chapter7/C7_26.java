package Chapter7;

import java.util.Scanner;

/**
 * Program to check if two lists are identical
 *
 * @author Angelina Zheng
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int length1 = input.nextInt();
        int[] array1 = new int[length1];
        for (int x = 1; x <= array1.length; x++) {
            array1[x - 1] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int length2 = input.nextInt();
        int[] array2 = new int[length2];
        for (int y = 1; y <= array2.length; y++) {
            array2[y - 1] = input.nextInt();
        }
        if (equals(array1, array2)) {
            System.out.print("Two lists are strictly identical");
        } else {
            System.out.print("Two lists are not strictly identical");
        }
    }

    /**
     * Method to check if two lists are equal
     *
     * @param list1 an array of integers
     * @param list2 second array of integers
     * @return boolean variable
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        } else {
            return java.util.Arrays.equals(list1, list2);
        }
    }
}
