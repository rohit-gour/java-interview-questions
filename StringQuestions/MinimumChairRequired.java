package StringQuestions;

public class MinimumChairRequired {

    public int minimumChairs(String s) {
        int currentChairs = 0; // Current number of occupied chairs
        int maxChairs = 0;     // Maximum number of chairs needed

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                currentChairs++; // A person enters, occupy a chair
            } else if (s.charAt(i) == 'L') {
                currentChairs--; // A person leaves, free a chair
            }
            // Update the maximum number of chairs needed
            maxChairs = Math.max(maxChairs, currentChairs);
        }

        return maxChairs;
    }
}
