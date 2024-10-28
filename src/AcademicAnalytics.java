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
        
        // TODO: Implement a search algorithm that returns an array of students above or below a given GPA
        // Hint: Define at least one additional method for AcademicAnalytics that invokes this functionality 
        // Make sure that the array is sorted first!
        // searchByGPA()
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
        MergeSort.sort(quickSortStudents, 0, quickSortStudents.length - 1);
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
