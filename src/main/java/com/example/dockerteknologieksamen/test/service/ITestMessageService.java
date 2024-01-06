package com.example.dockerteknologieksamen.test.service;

import com.example.dockerteknologieksamen.test.model.TestMessage;

import java.util.List;

public interface ITestMessageService {
    void createTestMessage(String message);
    List<TestMessage> getTestMessages();
}
