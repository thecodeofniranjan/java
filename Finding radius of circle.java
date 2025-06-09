import java.util.Scanner;

public class RadiusOfCircle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        float radius = circle.nextFloat();
        Double area = 3.14 * radius * radius;
        System.out.println("The radius is: " + radius);
        System.out.println("The area of the circle is: " + area);

    }

}
