import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner NK = new Scanner(System.in);

// Find Maximum of Three Numbers:

        System.out.print("Enter Number 1 : ");
        int a = NK.nextInt();

        System.out.print("Enter Number 2 : ");
        int b = NK.nextInt();

        System.out.print("Enter Number 3 : ");
        int c = NK.nextInt();

        if (a > b && a > c) {
            System.out.print("Number " + a + "higest than that of number " + b + "and" + c);

        } else if (b > c && b < a) {
            System.out.print("Number " + b + "higest than that of number " + a + "and" + c);
        }

        else if (c > a && c > b) {
            System.out.print("Number " + c + "higest than that of number " + b + "and" + a);
        } else {
            System.out.print("All three numbers are equal");
        }
    }

}
