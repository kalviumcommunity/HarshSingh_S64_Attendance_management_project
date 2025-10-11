package com.school;

public class Course{

    private int courseId;
    private String courseName;
    private static int nextCourseIdCounter = 1;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void setDetails(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public void displayDetails() {
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName);
    }
}