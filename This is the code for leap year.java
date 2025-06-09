import java.util.Scanner;

public class Code {
    // This is the code for leap year
    public static void main(String[] args) {
        Scanner NK = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int a = NK.nextInt();
        if (a % 4 == 0) {
            System.out.println(a + "This is an leap year");
        } else {
            System.out.println("This is not an leap year");
        }

    }

}
