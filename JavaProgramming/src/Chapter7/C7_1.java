package Chapter7;

import java.util.Scanner;

/**
 * Program to assign grades based on overall scoring
 *
 * @author Angelina Zheng
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int best = 0;
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] scores = new int[numStudents];
        char[] grades = new char[numStudents];
        //read student scores
        System.out.print("Enter " + numStudents + " scores: ");
        for (int x = 0; x < scores.length; x++) {
            scores[x] = input.nextInt();
        }

        //find best score
        for (int i : scores) {
            if (i > best) {
                best = i;
            }
        }
        //assign grade based on best score
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] >= best - 10) {
                grades[j] = 'A';
            } else if (scores[j] >= best - 20) {
                grades[j] = 'B';
            } else if (scores[j] >= best - 30) {
                grades[j] = 'C';
            } else if (scores[j] >= best - 40) {
                grades[j] = 'D';
            } else {
                grades[j] = 'F';
            }
        }
        for (int k = 0; k < scores.length; k++) {
            System.out.println("Student " + k + " score is " + scores[k] + " and grade is " + grades[k]);
        }
    }
}
