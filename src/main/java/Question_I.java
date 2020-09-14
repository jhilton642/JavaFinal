public class Question_I {
    public static void main(String[] args) {
        while (true) {
            int aNumber = Utils.getNumber("Enter a number  ");
            if (aNumber < 10) {
                String ones = onesMethod(aNumber);
                System.out.println(ones);
            } else if (aNumber < 20 && aNumber > 10) {
                String teens = teensMethod(aNumber);
                System.out.println(teens);
            } else if (aNumber == 10) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 20) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 30) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 40) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 50) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 60) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 70) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 80) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber == 90) {
                String tens = tensMethod(aNumber);
                System.out.println(tens);
            } else if (aNumber > 20 && aNumber < 30) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 30 && aNumber < 40) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 40 && aNumber < 50) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 50 && aNumber < 60) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 60 && aNumber < 70) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 70 && aNumber < 80) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 80 && aNumber < 90) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber > 90 && aNumber < 100) {
                String ones = onesMethod(aNumber);
                String tens = tensMethod(aNumber);
                System.out.println(tens + "-" + ones);
            } else if (aNumber < 100) {
                continue;
            } else if (aNumber >= 100) {
                break;
            }
        }
    }


    public static String onesMethod(int aNumber) {
        String onesWord = "";
        int ones = aNumber % 10;
        switch (ones) {
            case 0:
                onesWord = "zero";
                break;
            case 1:
                onesWord = "one";
                break;
            case 2:
                onesWord = "two";
                break;
            case 3:
                onesWord = "three";
                break;
            case 4:
                onesWord = "four";
                break;
            case 5:
                onesWord = "five";
                break;
            case 6:
                onesWord = "six";
                break;
            case 7:
                onesWord = "seven";
                break;
            case 8:
                onesWord = "eight";
                break;
            case 9:
                onesWord = "nine";
                break;
        }
        return onesWord;
    }

    public static String teensMethod(int aNumber) {
        String teensWord = "";
        switch (aNumber) {
            case 11:
                teensWord = "eleven";
                break;
            case 12:
                teensWord = "twelve";
                break;
            case 13:
                teensWord = "thirteen";
                break;
            case 14:
                teensWord = "fourteen";
                break;
            case 15:
                teensWord = "fifteen";
                break;
            case 16:
                teensWord = "sixteen";
                break;
            case 17:
                teensWord = "seventeen";
                break;
            case 18:
                teensWord = "eighteen";
                break;
            case 19:
                teensWord = "nineteen";
                break;
        }
        return teensWord;
    }

    public static String tensMethod(int aNumber) {
        int divideTen = aNumber / 10;
        int round = (int) Math.floor(divideTen);
        int tens = round * 10;
        String tensWord = "";
        switch (tens) {
            case 10:
                tensWord = "ten";
                break;
            case 20:
                tensWord = "twenty";
                break;
            case 30:
                tensWord = "thirty";
                break;
            case 40:
                tensWord = "forty";
                break;
            case 50:
                tensWord = "fifty";
                break;
            case 60:
                tensWord = "sixty";
                break;
            case 70:
                tensWord = "seventy";
                break;
            case 80:
                tensWord = "eighty";
                break;
            case 90:
                tensWord = "ninety";
                break;
        }
        return tensWord;
    }
}