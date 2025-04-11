public class SortDemo {

    // Method to sort an array in ascending order
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Start from i + 1 to avoid comparing the same pair twice
            for (int j = i + 1; j < array.length; j++) {
                // Use > to sort in ascending order
                if (array[i] > array[j]) {
                    // Swap elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {42, 1337, 7, 0, -1};
        sortArray(numbers);
        
        // Print the sorted array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
