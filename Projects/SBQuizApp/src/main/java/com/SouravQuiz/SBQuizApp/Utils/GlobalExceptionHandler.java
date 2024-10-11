package com.SouravQuiz.SBQuizApp.Utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorHandler> handleGeneralException(ErrorHandler ex){
//        return new ResponseEntity<>(
//                new ErrorHandler(false, "Interal Server Error"),
//                HttpStatus.INTERNAL_SERVER_ERROR
//        );
//    }
}
