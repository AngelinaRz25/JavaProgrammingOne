package Chapter8;

import java.util.Arrays;

/**
 * Program to calculate employee totals
 *
 * @author Angelina Zheng
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] employees = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        //creates an array of totals
        int[] rowTotals = new int[8];
        int[] orderedTotals = new int[8];
        int[] arrayTotals = new int[8];
        int[] index = new int[8];
        //loops through each every column in each row
        for (int row = 0; row < employees.length; row++) {
            //initializes total and resets total to 0 for each row
            int total = 0;
            for (int column = 0; column < employees[row].length; column++) {
                //adds each day's hours to total
                total += employees[row][column];
            }
            rowTotals[row] = total;
        }
        //copy rowTotal array and assign to orderedTotals and arrayTotals
        for (int i = 0; i < 8; i++) {
            orderedTotals[i] = rowTotals[i];
            arrayTotals[i] = rowTotals[i];
        }
        //sort orderedTotals array
        java.util.Arrays.sort(orderedTotals);
        //match employee with total
        for (int j = 0; j < 8; j++) {
            //find index/employee of orderedTotals in rowTotals
            index[j] = linearSearch(rowTotals, orderedTotals[j]);
            //set employee total to zero to avoid repeated employees
            rowTotals[index[j]] = 0;
        }
        System.out.println("\t\t Su \t M \t T \t W \t Th \t F \t Sa \t Total");
        for (int row = 0; row < 7; row++) {
            System.out.print("Employee" + row + "\t");
            for (int column = 0; column < 7; column++) {
                System.out.print(employees[row][column] + "\t");
            }
            System.out.print(arrayTotals[row]);
            System.out.println();
        }
        for (int i = 7; i >= 0; i--) {
            System.out.println("Employee " + index[i] + ": " + orderedTotals[i]);
        }
    }

    /**
     * Method to search through an array
     *
     * @param list an array
     * @param key the int value being searched for
     * @return an int value
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
