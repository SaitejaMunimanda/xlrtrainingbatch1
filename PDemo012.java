package PracticeFile;

import java.util.Scanner;
public class PDemo012 {
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your radius of the circle: ");
        double radius = sc.nextDouble();
        double PI = 3.14;
        double area = PI*radius*radius;
        System.out.println("Area of the circle is: "+area);
        sc.close();
    
}
public static void main(String[] args) {
    PDemo012 obj = new PDemo012();
    obj.display();
}
}
