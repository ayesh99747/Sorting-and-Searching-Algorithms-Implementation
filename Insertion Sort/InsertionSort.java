import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int array[]) {
        int size = array.length;
        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    // Driver code
    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        // We call the insertion sort method and pass the array, first index and the
        // last index.
        InsertionSort.insertionSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}