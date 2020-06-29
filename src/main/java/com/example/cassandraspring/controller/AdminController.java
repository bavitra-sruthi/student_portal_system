package com.example.cassandraspring.controller;
import com.example.cassandraspring.entity.Student;

import com.example.cassandraspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

public class AdminController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String helloController() {
        return "Hey the Application is running on port 8050";
    }


    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    @GetMapping("/admin/branch/section/students")
    public List<Student> getAllStudentsBySection() {
        return studentService.getAllStudentsBySection();
    }

    @PutMapping("/admin/branch/section/students/subj_id/{new_attendance}")
    public List<Integer> updateAllStudentsAttendance(@PathVariable Integer new_attendance) {
        return studentService.updateAllStudentsAttendance(new_attendance);
    }

    @PostMapping("/admin/branch/section/add/student")
    public List<Student> addStudent(@RequestBody Student s) {
        return studentService.addStudent(s);

        }
    }


