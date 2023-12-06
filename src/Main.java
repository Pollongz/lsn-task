import tasks.DistinctElementsTask;
import tasks.PairsTask;
import tasks.GraphTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {

            System.out.println("\nLSN recruitment app");
            System.out.println("Pick task between 1 and 3:\n");
            System.out.println("1. Output the list of distinct elements sorted in ascending order.");
            System.out.println("2. Find all the pairs (in this integer list) that sum up to 13.");
            System.out.println("3. Check how many separated graphs are in the input.");

            startProgram(getUserChoice(scanner));

            System.out.print("\nEnter 1 to start from the beginning, 0 to close the application: ");
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                runProgram = false;
            } else if (userInput != 1) {
                System.out.println("Invalid input. Please enter 1 to rerun or 0 to close.");
            }

            scanner.nextLine();
        }
        scanner.close();
    }

    private static void startProgram(int userChoice) {
        switch (userChoice) {
            case 1 -> DistinctElementsTask.run();
            case 2 -> PairsTask.run();
        }
    }

    private static int getUserChoice(Scanner scanner) {
        int userChoice;
        while (true) {
            try {
                System.out.print("\nEnter your choice:");
                userChoice = Integer.parseInt(scanner.nextLine());

                if (userChoice >= 1 && userChoice <= 3) {
                    break;
                } else {
                    System.out.println("Number needs to be between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return userChoice;
    }
}