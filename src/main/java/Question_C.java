public class Question_C {
    public static void main(String[] args) {
        int linesToPrint = Utils.getNumber("Enter number of lines to print:   ");
        printAsteriskWithLoop(linesToPrint);
    }

    private static void printAsteriskWithLoop(int linesToPrint) {
        for (int i=0; i < linesToPrint; i++ ){
            System.out.println(i + " - " + "*****");
        }
    }
}
