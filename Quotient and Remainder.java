import java.util.Scanner;
public class Code{
    public static void main(String[] args){
        Scanner NK=new Scanner(System.in);
        
        
         // Quotient and Remainder
         System.out.print(" Enter the divident :");
         double a=NK.nextDouble();
         
         System.out.print(" Enter the divisor:  ");
         double b=NK.nextDouble();
         
         double quotient =a / b;
         System.out.println(" The Quotient will be  " +quotient);
         
         double Reminder =a % b;
         System.out.print(" The Reminder will be  " +Reminder);
         
    }
} 
