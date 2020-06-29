package com.example.cassandraspring.controller;
import com.example.cassandraspring.entity.Student;

import com.example.cassandraspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController

public class AdminController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String helloController() {
        return "Hey the Application is running on port 8050";
    }


    @GetMapping("/admin/branch/section/students/subjectId/1")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/admin/branch/section/students/subjectId/1/studentId/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }



    @PutMapping("/admin/branch/section/students/subj_id/{new_attendance}")
    public List<Student> updateAllStudentsAttendance(@PathVariable Integer new_attendance) {
        return studentService.updateAllStudentsAttendance(new_attendance);
    }

    @PostMapping("/admin/branch/section/add/student")
    public Student addStudent(@RequestBody Student s) {
        return studentService.addStudent(s);

        }
    }


