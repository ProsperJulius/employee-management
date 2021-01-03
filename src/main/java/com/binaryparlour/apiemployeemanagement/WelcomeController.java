package com.binaryparlour.apiemployeemanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/api")
    private String welcomMessage(){
        return "welcome user";
    }
}
