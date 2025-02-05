package PracticeFile;

public class PDemo010 {
    String name = "sai";
    int account_no  = 1234;
    int balance = 10000;
    void account_details(){
        System.out.println("Hello "+name);
        System.out.println("Your account number is: "+account_no);
        System.out.println("Your balance is: "+balance);
    }
    void display_details(){
        System.out.println("Hello "+name);
        System.out.println("Your account number is: "+account_no);
        System.out.println("Your balance is: "+balance);
    }
    public static void main(String[] args) {
        PDemo010 obj = new PDemo010();
        obj.account_details();
        obj.display_details();
    }

    
}
