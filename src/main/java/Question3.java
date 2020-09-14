public class Question3 {
    public static void main(String[] args) {
        int num = Utils.getNumber("Enter a number  ");
        String answer;
        answer = intToDigits(num);
        System.out.println(num + " is a " + answer + " digit number");
    }
    public static String intToDigits(int num){
        String answer2 = "";
        int digitAnswer;
        String answer = Integer.toString(num);
        digitAnswer = answer.length();
        switch (digitAnswer){
            case 1:
                answer2 = "one";
                break;
            case 2:
                answer2 = "two";
                break;
            case 3:
                answer2 = "three";
                break;
            case 4:
                answer2 = "four";
                break;
            case 5:
                answer2 = "five";
                break;
            case 6:
                answer2 = "six";
                break;
            case 7:
                answer2 = "seven";
                break;
            case 8:
                answer2 = "eight";
                break;
            case 9:
                answer2 = "nine";
                break;
            case 10:
                answer2 = "ten";
                break;
        }
        return answer2;
    }
}
