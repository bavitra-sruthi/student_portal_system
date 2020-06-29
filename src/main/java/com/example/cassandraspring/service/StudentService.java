package com.example.cassandraspring.service;
import com.example.cassandraspring.entity.Student;

import com.example.cassandraspring.exceptions.StudentNotFoundException;
import com.example.cassandraspring.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

  //  private static List<Student> student = new ArrayList<>();
    @Autowired
    private StudentRepo studentRepo;
   /* static {
        student.add(new Student(2,"will","dwight@dmpc","ECE","B",75,75));
        student.add(new Student(1,"dwight","dwight@dmpc","ECE","B",75,75));
    }
*/



    public List<Student> getAllStudents() {
        return studentRepo.findAll();

    }


    public Optional<Student> getStudentById(int id){
        Optional <Student> optionalStudent = studentRepo.findById(id);
        if(!optionalStudent.isPresent())
            throw new StudentNotFoundException("Student not found!");
        return studentRepo.findById(id);
    }


    public List<Student> updateAllStudentsAttendance(Integer new_attendance) {
        List<Student> students = studentRepo.findAll();
        for(Student s : students) {
            int temp = s.getStudentAttendance();
            s.setStudentAttendance(temp+new_attendance);
       }
       return studentRepo.findAll();
    }

    public Student addStudent(Student s){
        return studentRepo.save(s);
    }
    }
