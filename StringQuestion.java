public class StringQuestion {
    // Program to count frequency of a particular word
    public void wordCounter(String message) {
        String[] messageInArray = message.split("\\s+");
        int count = 0;
        String word = "Ram";
        for (String w : messageInArray) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println("The frequency of \"" + word + "\" is: " + count);
    }

    //method to count the given pattern in the word

    public void countPatternFromWord(){
        String word = "myNameIsRoohitGourIsYourNameIsAlsoRoohitIMeanRohit";
        String pattern = "Rohit";
        int count = 0;
        int index = 0;

        while ((index = word.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        System.out.println("Rohit comes "+count);
    }
}
