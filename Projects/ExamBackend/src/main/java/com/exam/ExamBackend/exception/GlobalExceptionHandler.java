package com.exam.ExamBackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {UserAlreadyExistException.class})
    public ResponseEntity<Object> handleUserAlreadyExistException(UserAlreadyExistException userAlreadyExistException){

        ExamPortalException examPortalException = new ExamPortalException(
                userAlreadyExistException.getMessage(),
                HttpStatus.CONFLICT
        );

        return new ResponseEntity<>(examPortalException, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = {UserFieldException.class})
    public ResponseEntity<Object> handleUserFieldException(UserFieldException userFieldException){

        ExamPortalException examPortalException = new ExamPortalException(
                userFieldException.getMessage(),
                HttpStatus.BAD_REQUEST
        );

        return new ResponseEntity<>(examPortalException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleDefaultException(Exception exception){

        ExamPortalException examPortalException = new ExamPortalException(
                exception.getMessage() == null ? "Internal server error" : exception.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );

        return new ResponseEntity<>(examPortalException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
