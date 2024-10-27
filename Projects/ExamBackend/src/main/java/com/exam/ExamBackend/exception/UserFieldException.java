package com.exam.ExamBackend.exception;

public class UserFieldException extends RuntimeException{
    public UserFieldException() {
    }

    public UserFieldException(String message) {
        super(message);
    }
}
