package com.demo.util;

import com.demo.response.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Util{

    // Valida el código de respuesta
    public ServiceResponse verifyAnswerCode(Integer answerCode, String message){

        ServiceResponse response = new ServiceResponse();
        response.setStatus("success");

        if(answerCode != 0){
            response = buildResponse(message, "error", 400, null);
        }
        return response;
    }

    // Construye una respuesta de error
    public ResponseEntity<ServiceResponse> buildErrorResponse(String message, HttpStatus status) {
        ServiceResponse response = new ServiceResponse();
        response.setStatus("error");
        response.setMessage(message);
        response.setData(null);
        response.setCode(status.value());
        return ResponseEntity.status(status).body(response);
    }

    // Construye una respuesta
    public ServiceResponse buildResponse(String message, String status, Integer code, Object data) {
        ServiceResponse response = new ServiceResponse();
        response.setStatus(status);
        response.setMessage(message);
        response.setData(data);
        response.setCode(code);
        return response;
    }

    }
