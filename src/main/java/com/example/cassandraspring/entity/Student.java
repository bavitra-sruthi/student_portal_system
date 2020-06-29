package com.example.cassandraspring.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import java.util.Arrays;


@Entity
@Table(name="employee")
public class Student {

    @PrimaryKey
    private Integer studentId;
    @NotNull
    private String studentName;
    @Email
    @NotNull
    private String studentEmail;
    @NotNull
    private String studentBranch;
    @NotNull
    private String studentSection;
    @NotNull
    private int studentMarks;
    @NotNull
    private int studentAttendance;

    public Student(Integer studentId, String studentName, String studentEmail, String studentBranch,String studentSection,Integer studentMarks,Integer studentAttendance){
        this.studentAttendance = studentAttendance;
        this.studentBranch = studentBranch;
        this.studentEmail = studentEmail;
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSection = studentSection;
        this.studentMarks = studentMarks;
    }
    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public int getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentAttendance(int studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentBranch='" + studentBranch + '\'' +
                ", studentSection='" + studentSection + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentAttendance=" + studentAttendance +
                '}';
    }
}