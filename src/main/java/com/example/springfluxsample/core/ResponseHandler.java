package com.example.springfluxsample.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status,
        Object resposneObject) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("status", status.value());
        map.put("data", resposneObject);

        return new ResponseEntity<>(map, status);
    }
}
