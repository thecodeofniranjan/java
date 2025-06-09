import java.util.Scanner;
  
  public class Conditional {
  public static void main(String[] args) {
  Scanner NK = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int a = NK.nextInt();
  if (a % 2 == 0) {
  System.out.println(a + "The number you have enter is even number");
  
  } else {
  System.out.println(a + "it is a odd number");
  }
  
  }
 }
