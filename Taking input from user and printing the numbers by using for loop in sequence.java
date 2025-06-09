
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner NK = new Scanner(System.in);
        System.out.println("enter the starting number");
        int i = NK.nextInt();
        System.out.println("enter the ending number");
        int b = NK.nextInt();

        for (int j = i; j <= b; j++) {
            System.out.println(j);
        }

    }

}
