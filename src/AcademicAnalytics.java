/*
 * Created on 2025-10-17
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import java.util.Random;

public class AcademicAnalytics {
    private Student[] students;

    public AcademicAnalytics(Student[] students) {
        this.students = students;
    }

    public static void main(String[] args) {
        Student[] studentGPAData = generateStudentArray(10);
        AcademicAnalytics sortingDemo = new AcademicAnalytics(studentGPAData);
        sortingDemo.sortByGPA();
        sortingDemo.searchByGPA();
        SortingManager manager = new SortingManager();
        long mergeTime = manager.performMergeSort(studentGPAData);
        long quickTime = manager.performQuickSort(studentGPAData);
        long gpaSearchTime = manager.performGPAsearch(studentGPAData);
        System.out.println(" ");
        System.out.println("MergeSort Time: " + mergeTime + " ms");
        System.out.println("QuickSort Time: " + quickTime + " ms");
        System.out.println("GPA Search Time: " + gpaSearchTime + " ms");
    }

    public Student[] searchByGPA(){
        Student [] searchGpa = this.students.clone();
        MergeSort.sort(searchGpa, 0, searchGpa.length - 1); // use merge sort because that's the one in ascending order
        Student [] above = GPABinarySearch.search(searchGpa, 1.1, true); // if gpa is above 1.1
        System.out.println("");
        System.out.println("Search GPA by threshold above 1.1 GPA");
        printStudents(above);
        return above;
    }
        

    
    public void sortByGPA() {
        System.out.println("Original List:");
        printStudents(this.students);

        // QuickSort
        Student[] quickSortStudents = this.students.clone(); // clone(): Clones and returns a copy of the object
        QuickSort.sort(quickSortStudents, 0, quickSortStudents.length - 1);
        System.out.println("\nSorted by QuickSort:");
        printStudents(quickSortStudents);

        // MergeSort
        Student[] mergeSortStudents = this.students.clone();
        MergeSort.sort(mergeSortStudents, 0, mergeSortStudents.length - 1);
        System.out.println("\nSorted by MergeSort:");
        printStudents(mergeSortStudents);
    }

    private static Student[] generateStudentArray(int size) {
        Student[] students = new Student[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            // Generate a random gpa
            double gpa = rand.nextDouble(0, 4.0);
            students[i] = new Student(RandomNameGenerator.generateRandomName(), gpa);
        }
        return students;
    }

    private void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class RandomNameGenerator {
    private static final String[] FIRST_NAMES = { "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George",
            "Hannah" };
    private static final String[] LAST_NAMES = { "Smith", "Johnson", "Brown", "Williams", "Jones", "Garcia", "Davis",
            "Martinez" };

    public static String generateRandomName() {
        Random random = new Random();
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)] + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }
}
