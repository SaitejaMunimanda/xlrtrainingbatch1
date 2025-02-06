public class Demo067 {
    public static void main(String[] args) {
        int[] array = {10, 21, 32, 43, 54, 65};

        System.out.println("Even elements of the array:");
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
    }
}

    
