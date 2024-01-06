package com.example.dockerteknologieksamen.test.service;

import com.example.dockerteknologieksamen.test.model.TestMessage;
import com.example.dockerteknologieksamen.test.repository.TestMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestMessageServiceImpl implements ITestMessageService {
    private final TestMessageRepository testMessageRepository;

    @Override
    public void createTestMessage(String message) {
        TestMessage testMessage = new TestMessage();
        testMessage.setMessage(message);
        testMessageRepository.save(testMessage);
    }

    @Override
    public List<TestMessage> getTestMessages() {
        return testMessageRepository.findAll();
    }
}
