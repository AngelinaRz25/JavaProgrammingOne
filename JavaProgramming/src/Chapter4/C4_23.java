package Chapter4;

import java.util.Scanner;

/**
 * Program to display employee name, hours, pay rate, and tax rates to console
 *
 * @author Angelina Zheng
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyRate;
        double federalWithholding = federalRate * grossPay;
        double stateWithholding = stateRate * grossPay;
        double deduction = stateWithholding + federalWithholding;
        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hoursWorked);
        System.out.printf("\nPay Rate: $%.2f", hourlyRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions: \n \t Federal Withholding(%.2f%%): $%.2f\n\t State Withholding(%.2f%%): $%.2f\n\t Total Deduction: $%.2f",
                (federalRate * 100), federalWithholding, (stateRate * 100), stateWithholding, (deduction));
        System.out.printf("\nNet Pay: $%.2f", (grossPay - deduction));
    }
}
