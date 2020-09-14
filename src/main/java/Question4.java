public class Question4 {
    public static String rollTheDice(int sidesOfDie) {
        String dice = "";
        int randomNumber = (int) (Math.random() * sidesOfDie);
        switch (randomNumber) {
            case 1:
                dice = "one";
                break;
            case 2:
                dice = "two";
                break;
            case 3:
                dice = "three";
                break;
            case 4:
                dice = "four";
                break;
            case 5:
                dice = "five";
                break;
            case 6:
                dice = "six";
                break;
            case 7:
                dice = "seven";
                break;
            case 8:
                dice = "eight";
                break;
            case 9:
                dice = "nine";
                break;
            case 10:
                dice = "ten";
                break;
        }
        return dice;
    }

    public static void main(String[] args) {
        int max = Utils.getNumber("How many sides would you like your die to have (between 1 and 10)");
        if (max > 10) {
            System.out.println("That is not a number between 1 and 10...");
            System.exit(1);
        }
        if (max < 1) {
            System.out.println("That is not a number between 1 and 10");
            System.exit(1);
        }
        String strNum = rollTheDice(max);
        System.out.println("You rolled a " + strNum);
    }
}
