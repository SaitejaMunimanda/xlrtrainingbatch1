package PracticeFile;
import java.util.Scanner;

public class PDemo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the base of the triangle:");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle:");
        double height = sc.nextDouble();
        double area = 0.5*base*height;
        System.out.println("Area of the triangle is: "+area);
        sc.close();
    }
    
}
