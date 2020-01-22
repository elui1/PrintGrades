import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean enterScore = true;

        while (enterScore) {
            System.out.print("Enter an exam score: ");
            int score = input.nextInt();
            String grade;

            if (score >= 97 && score <= 100) {
                grade = "A+";
            }
            else if (score >= 94) {
                grade = "A";
            }
            else if (score >= 90) {
                grade = "A-";
            }
            else if (score >= 87) {
                grade = "B+";
            }
            else if (score >= 84) {
                grade = "B";
            }
            else if (score >= 80) {
                grade = "B-";
            }
            else if (score >= 77) {
                grade = "C+";
            }
            else if (score >= 74) {
                grade = "C";
            }
            else if (score >= 70) {
                grade = "C-";
            }
            else if (score >= 60) {
                grade = "D";
            }
            else {
                grade = "Go back to School";
            }

            System.out.println();
            System.out.println("Your grade is " + grade);
            System.out.print("Do you want to enter another score (Y/N)? ");
            String userInput = input.next();

            while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N")) {
                System.out.println("Invalid input.");
                System.out.print("Do you want to enter another score (Y/N)? ");
                userInput = input.next();
            }

            if (userInput.equalsIgnoreCase("N")) {
                enterScore = false;
            }
        }
    }
}
