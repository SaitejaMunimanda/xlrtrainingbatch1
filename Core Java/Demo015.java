import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value of [a]:");
        int a = scanner.nextInt();
        System.out.print("Enter value of [b]:");
        int b = scanner.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after Swapping ");
        System.out.print("[a]="+a);
        System.out.print("[b]="+b);
        scanner.close();
    }
}