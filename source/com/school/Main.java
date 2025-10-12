package com.school;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array of Students
        Student[] students = new Student[2];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");

        // Array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course("Java Fundamentals");
        courses[1] = new Course("Java Fundamentals");

        System.out.println("=== Students ===");
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("\n=== Courses ===");
        for (Course course : courses) {
            course.displayDetails();
        }
        
        // Create ArrayList for AttendanceRecord
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();
        
        // Create AttendanceRecord objects using getStudentId() and getCourseId()
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[1].getCourseId(), "Present"));
        // Adding one with invalid status to test validation
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[0].getCourseId(), "Late"));
        
        System.out.println("\n=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}