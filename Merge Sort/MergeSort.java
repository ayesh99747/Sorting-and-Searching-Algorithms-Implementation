import java.util.Arrays;

public class MergeSort {

    // Merge two subarrays L and M into array
    public static void merge(int array[], int leftIndex, int midpoint, int rightIndex) {

        // Calculate the length of each array and create the two sub arrays
        int n1 = midpoint - leftIndex + 1;
        int n2 = rightIndex - midpoint;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // Populate the arrays with the values from the original array
        for (int i = 0; i < n1; i++)
            L[i] = array[leftIndex + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[midpoint + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = leftIndex;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two subarrays, sort them and merge them
    public static void mergeSort(int array[], int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            // m is the point where the array is divided into two subarrays
            int midpoint = (leftIndex + rightIndex) / 2;

            mergeSort(array, leftIndex, midpoint);
            mergeSort(array, midpoint + 1, rightIndex);

            // Merge the sorted subarrays
            merge(array, leftIndex, midpoint, rightIndex);
        }
    }

    // Driver program to Test merge sort
    public static void main(String args[]) {
        int array[] = { 6, 5, 12, 10, 9, 1 };

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        // We pass the array, first index and last index
        MergeSort.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}