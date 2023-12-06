package tasks;

import utils.IntegerListFromInput;

import java.util.*;

public class DistinctElementsTask {

    public static void run() {
        List<Integer> inputList = IntegerListFromInput.getNumberList();

        if (inputList.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        getDistinctList(inputList);
        getListSize(inputList);
        getDistinctSize(inputList);
        findMin(inputList);
        findMax(inputList);
    }
    private static void getDistinctList(List<Integer> inputList) {
        Set<Integer> set = new HashSet<>(inputList);
        List<Integer> distinctList = new ArrayList<>(set);
        Collections.sort(distinctList);
        StringBuilder formattedOutput = new StringBuilder();

        for (int number : distinctList) {
            formattedOutput.append(number).append(" ");
        }

        System.out.println("\n" + formattedOutput);
    }

    private static void getDistinctSize(List<Integer> inputList) {
        Set<Integer> set = new HashSet<>(inputList);
        List<Integer> distinctList = new ArrayList<>(set);
        System.out.println("distinct: " + distinctList.size());
    }

    private static void getListSize(List<Integer> inputList) {
        System.out.println("count: " + inputList.size());
    }

    public static void findMin(List<Integer> numbers) {
        System.out.println("min: " + numbers.stream().mapToInt(i -> i).min().getAsInt());
    }

    public static void findMax(List<Integer> numbers) {
        System.out.println("max: " + numbers.stream().mapToInt(i -> i).max().getAsInt());
    }
}
