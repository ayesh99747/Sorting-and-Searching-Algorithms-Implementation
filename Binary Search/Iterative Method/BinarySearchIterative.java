public class BinarySearchIterative {
    public static int binarySearch(int array[], int numberToBeFound, int low, int high) {
        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == numberToBeFound)
                return mid;
            if (array[mid] < numberToBeFound)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int size = array.length;
        int numberToBeFound = 4;
        int result = BinarySearchIterative.binarySearch(array, numberToBeFound, 0, size - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}