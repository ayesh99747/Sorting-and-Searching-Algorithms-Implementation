def selectionSort(array, size):

    for step in range(size):
        min_idx = step

        for i in range(step + 1, size):

            # to sort in descending order, change > to < in this line
            # select the minimum element in each loop
            if array[i] < array[min_idx]:
                min_idx = i

        # put min at the correct position
        (array[step], array[min_idx]) = (array[min_idx], array[step])


# Test code
array = [8, 7, 2, 1, 0, 9, 6]
size = len(array)
print('Unsorted Array')
print(array)
selectionSort(array, size)
print('Sorted Array')
print(array)
