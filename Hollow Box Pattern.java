import java.util.Scanner;

public class Niranjan {
    public static void main(String[] args) {
       
        Scanner NK = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {           
            for (int j = 1; j <= 5; j++) {      
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.print("*");      
                } else {
                    System.out.print(" ");       
                }
            }
            System.out.println();               
        }
    }
}

