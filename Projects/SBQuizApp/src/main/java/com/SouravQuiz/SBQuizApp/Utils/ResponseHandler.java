package com.SouravQuiz.SBQuizApp.Utils;

public class ResponseHandler<RESPONSE_DATA> {

    private boolean success;
    private String message;
    private RESPONSE_DATA data;

    public ResponseHandler(boolean success, String message, RESPONSE_DATA data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ResponseHandler(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RESPONSE_DATA getData() {
        return data;
    }

    public void setData(RESPONSE_DATA data) {
        this.data = data;
    }
}
