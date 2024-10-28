/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class QuickSort {

    public static void sort(/* TODO: Type */, int left, int right) {
        if (left < right) {
            // Partitioning index of current pivot element
            int partitioningIndex = partition(array, left, right);
            
            // Preview: A method calling itself is called "recursion".
            // TODO: define the correct arguments to sort the sub-arrays
            sort(array, ... );
            sort(array, ...);
        }
    }

    private static int partition(/* TODO: Type */, int left, int right) {
        // TODO: Select the pivot element
        /* TODO: Type */ pivot = null;

        int i = left - 1;
        // Reorder the array
        for (int j = left; j < right; j++) {
            if (array[j].getGPA() <= pivot.getGPA()) {
                i++;
                // TODO: reorder the elements
            }
        }
        // TODO: Place pivot element at the correct position in the array
        // All elements to the left of the pivot are less than or equal to the pivot
        // All elements to the right of the pivot are greater than the pivot

        // Returns the index of the pivot element
        return i + 1;
    }
}