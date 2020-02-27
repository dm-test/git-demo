package org.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("SimpleTests")
@DisplayName("Простые тесты")
public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

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

    @Tag("Длинный")
    @DisplayName("Первый простой тест")
    @Test
    void simpleTest1() {
        LOG.info("Test1 complete!");
    }

    @DisplayName("Второй простой тест")
    @Test
    void simpleTest2() {
        LOG.info("Test2 complete!");
    }
}
