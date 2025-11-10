package com.school;

public class AttendanceRecord implements Storable {
    private Student student; // optional Student object
    private Course course; // optional Course object
    private int studentId; // stored ID (used for file storage / when Student not available)
    private int courseId; // stored ID (used for file storage / when Course not available)
    private String status;

    // Constructor using objects
    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        this.studentId = (student != null) ? student.getId() : -1;
        this.courseId = (course != null) ? course.getCourseId() : -1;
        setStatus(status);
    }

    // Constructor using IDs (useful when only IDs are known / when loading from
    // storage)
    public AttendanceRecord(int studentId, int courseId, String status) {
        this.student = null;
        this.course = null;
        this.studentId = studentId;
        this.courseId = courseId;
        setStatus(status);
    }

    private void setStatus(String status) {
        if ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid attendance status provided ('" + status + "'). Set to 'Invalid'.");
        }
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        String studentPart = (student != null) ? (student.getName() + " (ID: " + student.getId() + ")")
                : ("Student ID: " + studentId);
        String coursePart = (course != null) ? (course.getCourseName() + " (ID: C" + course.getCourseId() + ")")
                : ("Course ID: C" + courseId);
        System.out.println("Attendance: " + studentPart + " in " + coursePart + " - Status: " + status);
    }

    @Override
    public String toDataString() {
        // Save IDs for simplicity in file storage (use stored ids)
        return studentId + "," + courseId + "," + status;
    }
}
