package Chapter5;

import java.util.Scanner;

/**
 * Program to count number of votes
 *
 * @author Angelina Zheng
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yes = 0;
        int no = 0;
        int invalid = 0;
        int total = 0;
        String vote;
        do {
            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            vote = input.nextLine();
            if (vote.equalsIgnoreCase("y")) {
                yes++;
            } else if (vote.equalsIgnoreCase("n")) {
                no++;
            } else if (!(vote.equalsIgnoreCase("q"))) {
                System.out.print("INVALID CODE: ");
                invalid++;
            }
            if (!(vote.equalsIgnoreCase("q"))) {
                total++;
            }
        } while (!(vote.equalsIgnoreCase("q")));
        System.out.printf("Yes votes: %d\nNo votes: %d\nInvalid votes: %d\nTotal votes: %d", yes, no, invalid, total);
    }
}
