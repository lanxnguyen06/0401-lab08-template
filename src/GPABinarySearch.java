/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class GPABinarySearch {
    // Returns students above or below a GPA threshold using binary search
    // Assumes the array will be sorted before search
    public static Student[] search(Student[] array, double threshold, boolean isAbove) {
        int cutoffIndex = binarySearch(array, threshold); // finds index of 1st student who's gpa >= threshold

        if(cutoffIndex == array.length-1){ // in case only 1 student meets threshold
            return Arrays.copyOfRange(array, cutoffIndex, array.length);
        }
        if (cutoffIndex == -1){ // no students meet threshold
            return new Student[0]; //if the student with that threshold doesn't exist then it returns array of no students
        }
        if (isAbove == true){
            return Arrays.copyOfRange(array, cutoffIndex, array.length); // returns students who's gpa >= threshold
        }else{
            return Arrays.copyOfRange(array, 0, cutoffIndex); // returns students who's gpa < threshold
        }
    }

public static int binarySearch(Student[] array, double threshold) {
    int result = array.length; 
    int left = 0;
    int right = array.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        double gpa = array[mid].getGPA();
        
        if (gpa >= threshold) {
            result = mid;      
            right = mid - 1;   
        } else {
            left = mid + 1;    
        }
    }
    return result;  // returns array.length if all gpas < threshold
    }
}
