package com.school;

public class Main {
    private static int nextCourseIdCounter = 1;
    public static void main(String[] args) {
        // Array of Students
        Student[] students = new Student[2];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");

        // Array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course ("Java Fundamentals" );
        courses[1] = new Course("Java Fundamentals");

        System.out.println("=== Students ===");
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("\n=== Courses ===");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
