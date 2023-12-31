package com.example.dockerteknologieksamen.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getTestMsg() {
        return "<h1 style=\"color: green\">" + "Test is working" + "</h1>";
    }
}
