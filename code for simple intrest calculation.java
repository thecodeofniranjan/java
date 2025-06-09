import java.util.Scanner;
public class Code{
    public static void main(String[] args){
        Scanner NK=new Scanner(System.in);

// code for simple intrest calculation


        System.out.print("what is the principle amount taken: ");
        int a=NK.nextInt();
        
        System.out.print("what is the rate of intrest: ");
        double b=NK.nextDouble();
        
        System.out.print("what is the time period  in months : ");
        double c=NK.nextDouble();
        
        
        double SI=(a*b*(c/12))/100;
        
        System.out.print("The simple intrest is :" +SI);
        
    }
}
