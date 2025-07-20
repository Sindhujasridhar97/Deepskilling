package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/") // Maps root URL: http://localhost:8080/
    public String displayParsedDate() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date parsedDate = dateFormat.parse("31/12/2018");
            return "Parsed Date: " + parsedDate;
        } catch (Exception e) {
            return "Error parsing date: " + e.getMessage();
        }
    }
}
