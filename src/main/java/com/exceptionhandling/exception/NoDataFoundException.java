package com.exceptionhandling.exception;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException(String msg){

        super(msg);
    }
}
//The NoDataFoundException class is a custom exception that extends RuntimeException,
// but it doesn't directly participate in the handling of the exception.
// It's simply thrown when a condition is met in the CustomerRestController class.
// The handling of this exception is done by the ExceptionHandler method in the ExceptionMapper class.