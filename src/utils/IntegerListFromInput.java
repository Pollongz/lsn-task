package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerListFromInput {

    public static List<Integer> getNumberList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        System.out.println("Enter a list of numbers separated by spaces:");

        try {
            String input = scanner.nextLine();
            String[] numberStrings = input.split("\\s+");

            for (String numberString : numberStrings) {
                int number = Integer.parseInt(numberString);
                numberList.add(number);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid list of numbers.");
        }

        return numberList;
    }
}
