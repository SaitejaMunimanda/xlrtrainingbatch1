
import java.util.Scanner;

public class Demo012{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle ");
        double radius = sc.nextDouble();
        double PI = 3.12;
        double area = PI*radius*radius;
        System.out.println("Area of the circle is: "+area);
        sc.close();
    }
}
