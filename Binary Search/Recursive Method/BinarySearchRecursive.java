public class BinarySearchRecursive {
    public static int binarySearch(int array[], int numberToBeFound, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array[mid] == numberToBeFound)
                return mid;

            // Search the left half
            if (array[mid] > numberToBeFound)
                return binarySearch(array, numberToBeFound, low, mid - 1);

            // Search the right half
            return binarySearch(array, numberToBeFound, mid + 1, high);
        }

        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int size = array.length;
        int numberToBeFound = 4;
        int result = BinarySearchRecursive.binarySearch(array, numberToBeFound, 0, size - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}