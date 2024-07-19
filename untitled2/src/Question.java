import java.util.*;

public class Question {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 1, 1, 2, 2, 2};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> frequencyList = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencyList, Collections.reverseOrder());

        int secondMostRepeatedNumber = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == frequencyList.get(1)) {
                secondMostRepeatedNumber = entry.getKey();
                break;
            }
        }
        if (secondMostRepeatedNumber == -1) {
            System.out.println("No second most repeated number found.");
        } else {
            System.out.println("Second most repeated number: " + secondMostRepeatedNumber);
        }
    }
}
