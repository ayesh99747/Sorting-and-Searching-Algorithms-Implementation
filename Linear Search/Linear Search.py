def linearSearch(array, size, numberToBeFound):
    # Going through array sequencially
    for i in range(0, size):
        if (array[i] == numberToBeFound):
            return i
    return -1


array = [2, 4, 0, 1, 9]
numberToBeFound = 1
size = len(array)
result = linearSearch(array, numberToBeFound, size)
if(result == -1):
    print("Element not found")
else:
    print("Element found at index: ", result)
