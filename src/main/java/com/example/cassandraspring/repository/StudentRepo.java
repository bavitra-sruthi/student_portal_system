package com.example.cassandraspring.repository;

import com.example.cassandraspring.entity.Student;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StudentRepo extends CassandraRepository<Student, Integer> {
}