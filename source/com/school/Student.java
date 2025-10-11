package com.school;

public class Student {
    private int studentId;
    private String name;
    private static int nextStudentIdCounter = 1;

    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    public void setDeatails(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
