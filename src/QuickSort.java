/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class QuickSort {

    public static void sort(Student[] array, int left, int right) {
        if (left < right) {
            // Partitioning index of current pivot element
            int partitioningIndex = partition(array, left, right);
            
            // Preview: A method calling itself is called "recursion".
            sort(array, left, partitioningIndex - 1); // left partition
            sort(array, partitioningIndex + 1, right); // right partition
        }
    }

    private static int partition(Student[] array, int left, int right) {
        Student pivot = array[right];

        int i = left - 1; // before first element
        for (int j = left; j < right; j++) {
            if (array[j].getGPA() >= pivot.getGPA()) {
                i++;
                Student temp = array[i]; // store temp variable to swap it again
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Student temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1;
    }
}