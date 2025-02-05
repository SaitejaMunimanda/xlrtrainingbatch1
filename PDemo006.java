package PracticeFile;
import java.util.Scanner;
public class PDemo006 {
    public static void main(String[] args) {
        String username = "Saiteja";
        String pass = "Saiteja";
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the username : ");
            String uname = sc.next();            
            System.out.println(uname);
            System.out.print("Enter the password : ");
            String password = sc.next();
            System.out.println(password);
            if (uname.equals(username) && password.equals(pass)) {
                System.out.println("Hello Saiteja Happy New Year");
                break;
            } else {
                System.out.println("Invalid Credentials");
            } 
            
        }
    }

}
