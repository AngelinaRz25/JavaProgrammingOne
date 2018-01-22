package Chapter3;

import java.util.Scanner;

/**
 * Program to define properties of a number through a series of conditional
 * statements
 *
 * @author Angelina Zheng
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println("The first number is less than the second.");
        }
        if (num1 > num2) {
            System.out.println("The first number is greater than the second.");
        }
        if (num1 == num2) {
            System.out.println("The first number is equal to the second.");
        }
        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second”.");
        }
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second.");
        }
        if (num2 == 0.0) {
            System.out.println("Cannot divide by zero.");
        } else if ((num1 / num2) < 1) {
            System.out.println("proper fraction");
        } else {
            System.out.println("improper fraction");
        }
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
