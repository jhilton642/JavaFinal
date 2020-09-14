public class Question8 {
    public static void main(String[] args) {
        for (int i = -10; i < 101; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 89; i += 3) {
            System.out.println(i);
        }
        for (int i = 100; i > 89; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}