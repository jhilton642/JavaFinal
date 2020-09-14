public class Question_F {
    public static void main(String[] args) {
        int number1;
        int number2;
        number1 = Utils.getNumber("Input a number  ");
        number2 = Utils.getNumber("Input another number  ");
        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        }
        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }
        if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }
        if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        }
    }
}
