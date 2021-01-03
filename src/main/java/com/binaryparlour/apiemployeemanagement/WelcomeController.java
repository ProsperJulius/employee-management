package com.binaryparlour.apiemployeemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/api")
    private String welcomeMessage(){
        return "welcome user to the wonderfull app of mine";
    }
}
