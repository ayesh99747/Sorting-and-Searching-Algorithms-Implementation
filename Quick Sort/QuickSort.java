import java.util.Arrays;

class QuickSort {

    // This is the method to partition the array on the basis of pivot element
    public static int partition(int array[], int low, int high) {

        // Select the pivot element
        // In this case we select the last element
        int pivot = array[high];
        int i = (low - 1);

        // Put the elements smaller than pivot on the left and
        // greater than pivot on the right of pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1); // The pivot is returned.
    }

    public static void quickSort(int array[], int low, int high) {
        if (low < high) {
            // Select pivot position and put all the elements smaller
            // than pivot on left and greater than pivot on right
            int pivot = partition(array, low, high);

            // Sort the elements on the left of pivot
            quickSort(array, low, pivot - 1);

            // Sort the elements on the right of pivot
            quickSort(array, pivot + 1, high);
        }
    }

    // Driver code to test the quick sort algorithm
    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        int size = array.length;

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        // We call the quick sort method and pass the array, first index and the last
        // index.
        QuickSort.quickSort(array, 0, size - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}