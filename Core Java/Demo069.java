public class Demo069 {
    public static void main(String[] args) {
        int[] array = {10, 21, 32, 43, 54, 65};
        int sum = 0;

        for(int elements : array) {
            sum = elements + sum;
        }
        
        System.out.println("Sum of all the elements in the array: " + sum);
    }
}