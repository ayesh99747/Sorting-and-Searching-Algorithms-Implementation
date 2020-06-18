def binarySearch(array, numberToBeFound, low, high):
    if high >= low:
        mid = low + (high - low)//2
        # If found at mid, then return it
        if array[mid] == numberToBeFound:
            return mid
        # Search the left half
        elif array[mid] > numberToBeFound:
            return binarySearch(array, numberToBeFound, low, mid-1)
        # Search the right half
        else:
            return binarySearch(array, numberToBeFound, mid + 1, high)
    else:
        return -1


array = [3, 4, 5, 6, 7, 8, 9]
numberToBeFound = 4
result = binarySearch(array, numberToBeFound, 0, len(array)-1)
if result != -1:
    print("Element is present at index " + str(result))
else:
    print("Not found")
