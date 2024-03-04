package com.exceptionhandling.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping("/welcome")
    public String welcomeMsg(){
        String msg = "Welcome to Ashok IT..!!";
        int i=10/0;
        return msg;
    }
}
