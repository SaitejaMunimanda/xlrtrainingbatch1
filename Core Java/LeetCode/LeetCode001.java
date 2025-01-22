package LeetCode;

public class LeetCode001 {     
    public boolean isPalindrome(int x) {                  
        String str = Integer.toString(x);                 
        String reversedStr = new StringBuilder(str).reverse().toString();                         
        return str.equals(reversedStr);     
    } 

    public static void main(String[] args) {
        LeetCode001 solution = new LeetCode001();
        System.out.println(solution.isPalindrome(121));  
        System.out.println(solution.isPalindrome(-121)); 
        System.out.println(solution.isPalindrome(10));  
        System.out.println(solution.isPalindrome(0));   
    }
}
