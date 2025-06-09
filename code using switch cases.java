import java.util.Scanner;
 
 public class Conditional {
 public static void main(String[] args) {
 Scanner niranjan = new Scanner(System.in);
 System.out.print("Enter the value of button: ");
 int button = niranjan.nextInt();
 switch (button) {
  case 1:
  System.out.println("Hello");
  break;
  case 2:
  System.out.println("namaste");
  break;
  case 3:
  System.out.println("Bonjour");
  break;
  default:
  System.out.println("invaild button");
  }
  
  }
 }
