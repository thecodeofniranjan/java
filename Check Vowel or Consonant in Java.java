import java.util.Scanner;
public class Code{
    public static void main(String[] args){
        Scanner NK=new Scanner(System.in);
        
        
         // Check Vowel or Consonant in Java
         System.out.print(" Enter the alphabate in small letter :");
         char n=NK.next().charAt(0);
         
         if( n== 'a' || n== 'e' || n== 'i'|| n== 'o' || n== 'u'){
             System.out.print(  "It is an vowel :");
             
         }
         else{
             System.out.print( " It is an constant ");
         }
         
    }
}
