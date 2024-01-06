package com.example.dockerteknologieksamen.test.repository;

import com.example.dockerteknologieksamen.test.model.TestMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMessageRepository extends JpaRepository<TestMessage, Long> {
}
