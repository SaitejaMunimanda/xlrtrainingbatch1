package PracticeFile;
import java.util.Scanner;
public class PDemo060 {
    public static void main(String[] args){
        //int n = 20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        Long[] fibonacciSeries = new Long[n];

        fibonacciSeries[0] = 0L;
        fibonacciSeries[1] = 1L;
        for(int i = 2; i < n; i++){
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        System.out.println("Fibonacci series of " + n + " numbers:");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
    
}
