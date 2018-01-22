package Chapter3;

import java.util.Scanner;

/**
 * Program to simulate a coin toss and ask the user to guess the result
 *
 * @author Angelina Zheng
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //generates random int between 0 and 1 including 1
        int coinSide = 0 + (int) (Math.random() * 2);
        System.out.println("A coin is flipped. "
                + "Guess heads(0) or tails(1) by entering an integer.");
        int guess = input.nextInt();
        if (guess == coinSide) {
            System.out.println("Congrats! Your guess is correct.");
        } else {
            System.out.println("Sorry. Your guess is incorrect.");
        }

    }
}
