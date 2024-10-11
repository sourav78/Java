package com.SouravQuiz.SBQuizApp.Utils;

import org.springframework.http.HttpStatus;

public class ErrorHandler extends RuntimeException {
    private boolean success;
    private String errorMessage;
    private HttpStatus httpStatus;

    public ErrorHandler(String errorMessage, HttpStatus httpStatus) {
        super(errorMessage);
        this.success = false;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
