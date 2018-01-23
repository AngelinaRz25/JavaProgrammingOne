package Chapter5;

import java.util.Scanner;

/**
 * Program to perform a game of RockPaperScissors and display winner
 *
 * @author Angelina Zheng
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int compPoint = 0, userPoint = 0;
        String compMove = "", userMove = "";

        while (userPoint != (compPoint + 2) && compPoint != (userPoint + 2)) {
            int compInt = 0 + (int) (Math.random() * 3);
            System.out.print("Enter your move rock(0), paper(1) or scissors(2): ");
            int userInt = input.nextInt();
            switch (userInt) {
                case 0:
                    userMove = "rock";
                    break;
                case 1:
                    userMove = "paper";
                    break;
                case 2:
                    userMove = "scissors";
            }
            switch (compInt) {
                case 0:
                    compMove = "rock";
                    break;
                case 1:
                    compMove = "paper";
                    break;
                case 2:
                    compMove = "scissors";
            }
            System.out.println("The computer is " + compMove + ". You are " + userMove);

            if (userInt == compInt) {
                System.out.println("It is a draw.");
            } else if ((userInt == 0 && compInt == 2) || (userInt == 1 && compInt == 0) || (userInt == 2 && compInt == 1)) {
                userPoint++;
                System.out.println("You won.");
            } else if ((compInt == 0 && userInt == 2) || (compInt == 1 && userInt == 0) || (compInt == 2 && userInt == 1)) {
                compPoint++;
                System.out.println("You lost.");
            }
        }
        if (userPoint > compPoint) {
            System.out.print("You won more than 2 times.");
        } else {
            System.out.print("The computer won more than 2 times.");
        }
    }
}
