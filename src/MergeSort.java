/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

public class MergeSort {

    // Main function that sorts array[l..r] using merge()
    static void sort(Student[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            sort(array, left, mid);
            sort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merges two subarrays of array[].
    // Sub-array left: array[l..m]
    // Sub-array right: array[m+1..r]
    private static void merge(Student[] array, int left, int mid, int right) {
        int leftElementLength = mid - left + 1; // +1 bc inclusive
        int rightElementLength = right - mid;

        Student leftSubArray[] = new Student[leftElementLength]; 
        Student rightSubArray[] = new Student[rightElementLength];

        for (int i = 0; i < leftElementLength; ++i) {
            leftSubArray[i] = array[left + i];
        }
        for (int j = 0; j < rightElementLength; ++j) {
            rightSubArray[j] = array[mid + 1 + j];
        }

        int i = 0; // left subarray index
        int j = 0; // right subarray index
        int k = left; // merged array index
        while (i < leftElementLength && j < rightElementLength) {
            if (leftSubArray[i].getGPA() <= rightSubArray[j].getGPA()) {
                array[k] = leftSubArray[i];
                i++;
            } else {
                array[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        while (i < leftElementLength){
            array[k++] = leftSubArray[i++];
        }

        while (j < rightElementLength){
            array[k++] = rightSubArray[j++]; 
        }
    }
}
