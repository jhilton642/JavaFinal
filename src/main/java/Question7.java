public class Question7 {
    public static String IntToBin(int num) {
        String answer = Integer.toBinaryString(num);
        return answer;
    }

    public static void main(String[] args) {
        while (true) {
            int num = Utils.getNumber("Enter a number");
            System.out.println(IntToBin(num));
        }
    }
}