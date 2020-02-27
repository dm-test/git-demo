package org.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("ComplexTests")
@DisplayName("Сложные тесты")
public class ComplexTest {
    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

    @BeforeAll
    static void beforeAll() {
        LOG.info("Before All");
    }

    @BeforeEach
    void beforeEach() {
        LOG.info("Before Each");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("After All");
    }

    @AfterEach
    void afterEach() {
        LOG.info("After Each");
    }

    @DisplayName("Первый сложный тест")
    @Test
    void complexTest1() {
        LOG.info("ComplexTest1 complete!");
    }

    @DisplayName("Второй сложный тест")
    @Test
    void complexTest2() {
        LOG.info("ComplexTest2 complete!");
    }
}
