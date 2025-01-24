import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char lowerCaseChar = scanner.next().charAt(0);
        if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            char upperCaseChar = (char) (lowerCaseChar - 'a' + 'A');
            System.out.println("Uppercase character: " + upperCaseChar);
        } else {
            System.out.println("The input is not a lowercase character.");
        }

        scanner.close();
    }
}


// public class Demo042 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         String ch = scanner.next();
//         // String lowerCaseStr = ch.toLowerCase();
//         // System.out.println(lowerCaseStr); // Output: "hello world!"
//         String upperCaseStr = ch.toUpperCase();
//         System.out.println(upperCaseStr);
//     }

// }
