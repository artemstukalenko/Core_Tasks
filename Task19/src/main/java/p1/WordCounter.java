package p1;

public class WordCounter {

    public static void main(String[] args) {
        System.out.println(countWords("Hello world again!"));
    }

    private static int countWords(String inputValue) {
        int wordCounter = 1;

        for(char c : inputValue.toCharArray()) {
            if (c == ' ') {
                wordCounter++;
            }
        }

        return wordCounter;
    }
}
