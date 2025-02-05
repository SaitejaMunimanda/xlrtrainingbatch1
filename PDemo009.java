package PracticeFile;
import java.util.Scanner;
public class PDemo009 {
    private String username;
    private Long bnkaccount;
    private int balance;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        username = sc.nextLine();
        System.out.println("Enter acc number: ");
        bnkaccount = sc.nextLong();
        System.out.println("Enter your balance is :");
        balance = sc.nextInt();
    }
    void display(){
        System.out.println("Hello "+username+"\nYour account number is:"+bnkaccount+"\nYour Balance is:"+balance);
    }
    public static void main(String[] args) {
        PDemo009 obj = new PDemo009();
        obj.input();
        obj.display();
    }

    
}
