package Testcode;
import java.util.Scanner;
public class codetest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter yes to print happy sankranthi: ");
        String userinput=scanner.next();
        

        if(userinput.equalsIgnoreCase("Yes")){
            for (int i=1;i<=10;i++){
                System.out.println("Happy Sankranthi");

            }

        } else {
            System.out.println("Error if you want to print happy sankranthi you need to enter Yes");
        }
        
    }
}
