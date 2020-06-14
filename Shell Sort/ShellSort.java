import java.util.Arrays;

public class ShellSort {
    // Rearrange elements at each n/2, n/4, n/8, ... intervals
    public static void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    // Test code.
    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        int size = array.length;

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        // We call the quick sort method and pass the array, first index and the last
        // index.
        ShellSort.shellSort(array, size);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}