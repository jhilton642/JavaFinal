import java.util.Arrays;

public class Question_J {
    public static void main(String[] args) {
        String inputString = Utils.getInput("Enter a string  ");
        System.out.println(inputString);
        System.out.println(inputString.substring(inputString.length() / 2, inputString.length()));
        System.out.println(inputString.substring(0, inputString.length() / 2));
        String[] words = inputString.split(" ");
        int wordCount = 0;
        String longestWord = words[0];
        String tempWord = words[0];
        String tempWord2 = words[words.length - 1];
        for (var word : words) {
            if (word.length() > 0) {
                wordCount++;
            }
            System.out.println(word);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("There are " + wordCount + " words in the string");
        System.out.println("The longest word in the string is \"" + longestWord + "\" ");
        words[0] = tempWord2;
        words[words.length - 1] = tempWord;
        String newString = Arrays.toString(words);
        System.out.println(newString);
    }

}

