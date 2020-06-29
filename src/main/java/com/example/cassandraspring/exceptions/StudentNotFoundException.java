package com.example.cassandraspring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {

    private static final long serialVersionId = 1L;
    public StudentNotFoundException(String message) {
        super(message);
    }
}