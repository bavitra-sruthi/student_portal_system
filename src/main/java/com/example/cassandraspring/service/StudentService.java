package com.example.cassandraspring.service;
import com.example.cassandraspring.entity.Student;

import com.example.cassandraspring.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    List<Student> student = new ArrayList<>();
    @Autowired
    private StudentRepo studentRepo;

//    public Employee createEmployee(Employee emp) {
//
//        return employeeRepo.save(emp);
//    }


    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public List<Student> getAllStudentsBySection() {
        List<Student> students = studentRepo.findAll();
        List<Student> newList = null;
        for (Student student : students) {
            if ((student.getStudentBranch() == "Electronics") && (student.getStudentSection() == "A")) {
                newList.add(student);
            }
        }
        return null;

    }

    public Optional<Student> getStudentById(int id) {
        return studentRepo.findById(id);
    }

    public List<Integer> updateAllStudentsAttendance(Integer new_attendance) {
        List<Student> students = studentRepo.findAll();
        for(Student s : students) {
            s.setStudentAttendance(s.getStudentAttendance()+new_attendance);
       }
       return null;}

    public List<Student> addStudent(Student s){
        return getAllStudents();
    }


    }
