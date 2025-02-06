public class Demo068 {
    public static void main(String[] args) {
        int[] array = {10, 21, 32, 43, 54, 65};
        int count = 0;

        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count of even numbers in the array: " + count);
    }
}