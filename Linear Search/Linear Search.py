def linearSearch(array, size, numberToBeFound):
    # Going through array sequencially
    for i in range(0, size):
        if (array[i] == numberToBeFound):
            return i
    return -1


array = [2, 4, 0, 1, 9]
numberToBeFound = 10
size = len(array)
result = linearSearch(array, size-1, numberToBeFound)
if(result == -1):
    print("Element not found")
else:
    print("Element found at index: ", result)
