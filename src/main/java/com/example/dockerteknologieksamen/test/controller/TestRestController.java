package com.example.dockerteknologieksamen.test.controller;

import com.example.dockerteknologieksamen.test.model.TestMessage;
import com.example.dockerteknologieksamen.test.service.ITestMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestRestController {
    private final ITestMessageService testMessageService;

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getTestMsg() {
        return "<h1 style=\"color: green\">" + "Test is working!" + "</h1>";
    }

    @GetMapping("/messages")
    public List<TestMessage> getMessages() {
        return testMessageService.getTestMessages();
    }

    @GetMapping("/create/{message}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String createTestMessage(@PathVariable String message) {
        System.out.println(message);
        testMessageService.createTestMessage(message);
        return "Your message has been saved";
    }
}
