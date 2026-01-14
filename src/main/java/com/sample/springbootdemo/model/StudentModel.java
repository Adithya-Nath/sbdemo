package com.sample.springbootdemo.model;

public class StudentModel {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentPlace;

    public StudentModel() {
    }

    public StudentModel(int studentId, String studentName, int studentAge, String studentPlace) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPlace = studentPlace;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPlace() {
        return studentPlace;
    }

    public void setStudentPlace(String studentPlace) {
        this.studentPlace = studentPlace;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentPlace='" + studentPlace + '\'' +
                '}';
    }
}
