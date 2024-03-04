package com.exceptionhandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<ExceptionMessage> hanndleArithematicException(ArithmeticException arithmeticException){
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setCode("EXP001");
        exceptionMessage.setMsg(arithmeticException.getMessage());
        return new ResponseEntity<>(exceptionMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = NoDataFoundException.class)
    public ResponseEntity<ExceptionMessage> handleNoDataFoundException(NoDataFoundException noDataFoundException){
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setCode("EXP002");
        exceptionMessage.setMsg(noDataFoundException.getMessage());
        return new ResponseEntity<>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
