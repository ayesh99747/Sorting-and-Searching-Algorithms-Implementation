public class LinearSearch {
    public static int linearSearch(int array[], int numberToBeFound) {
        int n = array.length;
        // Going through array sequencially
        for (int i = 0; i < n; i++) {
            if (array[i] == numberToBeFound)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 0, 1, 9 };
        int numberToBeFound = 10;

        int result = linearSearch(array, numberToBeFound);

        if (result == -1)
            System.out.print("Element not found");
        else
            System.out.print("Element found at index: " + result);
    }
}