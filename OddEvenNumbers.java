public class OddEvenNumbers {
    public static void main(String[] args) {
        int limit = 10;

        System.out.println("Even numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
