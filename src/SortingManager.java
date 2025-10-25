public class SortingManager {
    
    public long performMergeSort(Student[] students){ // nano time returns a long
        Student[] mergeSortStudents = students.clone();
        long startTime = System.nanoTime();
        MergeSort.sort(mergeSortStudents, 0, mergeSortStudents.length - 1); // put in between to measure merge sort time
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long performQuickSort(Student[] students){
        Student[] quickSortStudents = students.clone();
        long startTime = System.nanoTime();
        MergeSort.sort(quickSortStudents, 0, quickSortStudents.length - 1); // put in between to measure quick sort time
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long performGPAsearch(Student[] students){
        Student[] gpaSearchStudents = students.clone();
        long startTime = System.nanoTime();
        MergeSort.sort(gpaSearchStudents, 0, gpaSearchStudents.length - 1); // put in between to measure gpa search time
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
