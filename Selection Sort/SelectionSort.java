import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    // driver code
    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        // We call the shell sort method and pass the array, first index and the last
        // index.
        SelectionSort.selectionSort(array);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}