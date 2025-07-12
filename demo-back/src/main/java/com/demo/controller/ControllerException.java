package com.demo.controller;

import com.demo.response.ServiceResponse;
import com.demo.util.Util;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerException {

    private final Util util;

    private ControllerException(Util util){
            this.util = util;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ServiceResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .findFirst()
                .orElse("Se ha producido un error.");

        return util.buildErrorResponse(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ServiceResponse> handleJsonParseException(HttpMessageNotReadableException ex) {
        String message = "El JSON enviado es inválido.";

        Throwable cause = ex.getCause();
        if (cause instanceof JsonParseException) {
            message = "JSON mal formado: " + ((JsonParseException) cause).getOriginalMessage();
        } else if (cause instanceof JsonMappingException) {
            message = ((JsonMappingException) cause).getPath().stream()
                    .map(ref -> "El campo '" + ref.getFieldName() + "' tiene un tipo incorrecto.")
                    .findFirst()
                    .orElse(message);
        }

        return util.buildErrorResponse(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ServiceResponse> handleGeneralException(Exception ex) {
        return util.buildErrorResponse("Ha ocurrido un inconveniente. Por favor, inténtelo nuevamente más tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
