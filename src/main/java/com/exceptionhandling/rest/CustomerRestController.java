package com.exceptionhandling.rest;

import com.exceptionhandling.exception.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<String> getCustomerPhno(@PathVariable Integer customerId){
        String phno = null;

        if(customerId >= 100){
            phno = "91-7057010437";
            return new ResponseEntity<>(phno, HttpStatus.OK);
        }
        else {
            throw new NoDataFoundException("No Customer Found With GIven Id : "+customerId);
        }
    }
}
