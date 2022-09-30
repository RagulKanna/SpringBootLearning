package com.learn.rest.webservices.restfulwebservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handlerAllException(Exception ex, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
     return new ResponseEntity(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handlerUserException(Exception ex, WebRequest request) {
        ErrorMessage errorMessage = new ErrorMessage(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
     return new ResponseEntity(errorMessage, HttpStatus.NOT_FOUND);
    }
}
