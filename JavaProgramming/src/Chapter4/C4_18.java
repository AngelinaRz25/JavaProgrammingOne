package Chapter4;

import java.util.Scanner;

/**
 * Program to classify student status and major
 *
 * @author Angelina Zheng
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullMajor = "";
        String fullStatus = "";
        System.out.print("Enter two characters: ");
        String userInput = input.next().toUpperCase();
        char major = userInput.charAt(0);
        char status = userInput.charAt(1);
        switch (major) {
            case 'M':
                fullMajor = "Mathematics";
                break;
            case 'C':
                fullMajor = "Computer Science";
                break;
            case 'I':
                fullMajor = "Information Technology";
                break;
            default:
                fullMajor = "Invalid input";
        }
        if (!(fullMajor.equals("Invalid input"))) {
            switch (status) {
                case '1':
                    fullStatus = "Freshman";
                    break;
                case '2':
                    fullStatus = "Sophomore";
                    break;
                case '3':
                    fullStatus = "Junior";
                    break;
                case '4':
                    fullStatus = "Senior";
                    break;
                default:
                    fullStatus = "Invalid input";
            }
        }
        if (!(fullMajor.equals("Invalid input")) && (!fullStatus.equals("Invalid input"))) {
            System.out.print(fullMajor + " " + fullStatus);
        } else if (fullMajor.equals("Invalid input")) {
            System.out.print(fullMajor);
        } else {
            System.out.print(fullStatus);
        }
    }
}
