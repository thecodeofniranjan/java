public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20, FirstNumber = 0, SecondNumber = 1;
        int thirdNumber;
        for (int i = 1; i <= n; i++) {
            System.out.println(FirstNumber + " , ");
            thirdNumber = FirstNumber + SecondNumber;
            FirstNumber = SecondNumber;
            SecondNumber = thirdNumber;

        }

    }
}
