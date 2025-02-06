public class Demo071 {
    public static void main(String[] args) {
        int[] array = {10, 21,32, 43, 54, 65};
        System.out.println("Originsl arrays: ");
        for (int elements : array) {
            System.out.print(elements + " ");
        }
        int n = array.length;
        for(int i=0;i<n/2;i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
        System.out.println("\nReversed array: ");
        for(int elements : array) {
            System.out.print(elements + " ");
        }

    }
    
}
