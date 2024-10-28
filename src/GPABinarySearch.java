/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Arrays;

public class GPABinarySearch {
    // Returns students above or below a GPA threshold using binary search
    // Assumes the array will be sorted before search
    public static Student[] search(Student[] array, double threshold, boolean isAbove) {
        int cutoffIndex = binarySearch(array, threshold);

        // TODO: Based on the cutoff index returned by binary search, decide which part of the
        // array to keep
        // Hint: You can use Arrays.copyOfRange(array, fromIndex, toIndex) or use a loop!
        return null;
    }

    // Binary search for threshold boundary
    // Binary search’s purpose here is to find the cutoff index (first element where
    // GPA is >= threshold)
    private static int binarySearch(Student[] array, double threshold) {
        // Result default if all GPAs < threshold
        int result = array.length; // = cutoff is beyond the last index
        // TODO: Implement

        // Hints: create a loop
        // calculate the mid element
        // look right

        return result;
    }
}
