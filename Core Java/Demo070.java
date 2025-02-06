public class Demo070 {
    public static void main(String[] args) {
        int[] array = {10, 21, 32, 43, 54, 65, 71, 83, 97};

        System.out.println("Prime numbers in the array:");
        for (int element : array) {
            if (isPrime(element)) {
                System.out.print(element + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}