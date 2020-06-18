def binarySearch(array, numberToBeFound, low, high):
    # Repeat until the pointers low and high meet each other
    while low <= high:
        mid = low + (high - low)//2
        if array[mid] == numberToBeFound:
            return mid
        elif array[mid] < numberToBeFound:
            low = mid + 1
        else:
            high = mid - 1
    return -1


array = [3, 4, 5, 6, 7, 8, 9]
numberToBeFound = 4
result = binarySearch(array, numberToBeFound, 0, len(array)-1)
if result != -1:
    print("Element is present at index " + str(result))
else:
    print("Element Not found!")
