package tasks;

import utils.IntegerListFromInput;

import java.util.Collections;
import java.util.List;

public class PairsTask {

    public static void run() {
        List<Integer> inputList = IntegerListFromInput.getNumberList();

        if (inputList.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        Collections.sort(inputList);
        checkPairs(inputList);
    }

    static void checkPairs(List<Integer> inputList) {
        for (int i = 0, j = i + 1; i < inputList.size() - 1 && j < inputList.size();) {
            int num1 = inputList.get(i);
            int num2 = inputList.get(j);

            if (num1 <= num2 && num1 + num2 == 13) {
                System.out.println(num1 + " " + num2);
            }

            if (++j == inputList.size()) {
                i++;
                j = i + 1;
            }
        }
    }
}
