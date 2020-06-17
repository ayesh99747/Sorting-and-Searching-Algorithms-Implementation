def shellSort(array, n):
    # Rearrange elements at each n/2, n/4, n/8, ... intervals
    interval = n // 2
    while interval > 0:
        for i in range(interval, n):
            temp = array[i]
            j = i
            while j >= interval and array[j - interval] > temp:
                array[j] = array[j - interval]
                j -= interval

            array[j] = temp
        interval //= 2


# Test code
array = [8, 7, 2, 1, 0, 9, 6]
size = len(array)
print('Unsorted Array')
print(array)
shellSort(array, size)
print('Sorted Array')
print(array)
