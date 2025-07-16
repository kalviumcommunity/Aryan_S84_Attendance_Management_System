package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Attendance System Project!");
        System.out.println("Session 1: Project Setup and Orientation Complete.");

        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        students[0] = new Student();
        students[0].setDetails(1, "Bruce Banner");

        students[1] = new Student();
        students[1].setDetails(2, "Tony Stark");

        courses[0] = new Course();
        courses[0].setDetails(193, "Quantum Physics");

        courses[1] = new Course();
        courses[1].setDetails(274, "Astrophysics");

        System.out.println("Student Details:");
        for (Student student : students) {  
            student.displayDetails();
        }

        System.out.println("Course Details:");
        for (Course course : courses) {
            course.displayDetails();
        }



    }
}


