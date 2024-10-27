package com.exam.ExamBackend.exception;

import org.springframework.http.HttpStatus;

public class ExamPortalException {

    private final boolean success = false;
    private String message;
    private HttpStatus httpStatus;

    public ExamPortalException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
