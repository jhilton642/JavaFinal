import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        String strangeWords = Utils.getRandomString();
        String[] words = strangeWords.split(" ");
        List<String> longWords = new ArrayList<>();
        String wordsLong = "";
        for (var word : words) {
            if (word.length() > 4) {
                System.out.println("Strings longer than 4:  " + word);
            }
        }
        for (var word : words) {
            if (word.contains("a")) {
                System.out.println("Strings that contain \"a\":  " + word.toUpperCase());
            }
        }
        for (var word : words) {
            if (word.length() > 6) {
                longWords.add(word);
            }
        }
        for (var longWord : longWords) {
            wordsLong += longWord + " ";
        }
        System.out.println("Long Strings:  " + wordsLong);
    }
}

