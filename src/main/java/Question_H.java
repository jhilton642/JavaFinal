import java.util.ArrayList;
        import java.util.List;

public class Question_H {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        String userInput;
        while (true) {
            userInput = Utils.getInput("Enter a string  ");
            if (userInput.isBlank()) {
                break;
            }
            sentences.add(userInput);
        }
        for (int i = 0; i < sentences.size(); i++) {
            System.out.println(sentences.get(i));
        }
        int numX = Utils.getNumber("Enter a random number  ");
        for (int i = 0; i < sentences.size(); i++) {
            if (sentences.get(i).length() > numX) {
                System.out.println(sentences.get(i));
            }
        }
        String stringX = Utils.getInput("Enter a string  ");
        for (int i = 0; i < sentences.size(); i++) {
            if (sentences.contains(stringX)) {
                System.out.println(stringX);
                break;
            }
        }
    }
}
