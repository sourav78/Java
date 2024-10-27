package com.exam.ExamBackend.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder(
            String message,
            HttpStatus httpStatus,
            Object responseObject
    ){
        Map<String, Object> responseMap = new LinkedHashMap<>();
        responseMap.put("success", true);
        responseMap.put("message", message);
        responseMap.put("httpStatus", httpStatus);

        if(responseObject != null){
            responseMap.put("data", responseObject);
        }

        return new ResponseEntity<>(responseMap, httpStatus);
    }

}
