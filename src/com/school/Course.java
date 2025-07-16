package com.school;

public class Course {
    int courseId;
    String courseName;

    public void setDetails(int id, String cName){
        this.courseId = id;
        this.courseName = cName;
    }

    public void displayDetails(){
        System.out.println("Course ID: " + this.courseId + ", Course Name: " + this.courseName);
    }


}
