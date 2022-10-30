package ru.nikitin.test_task_htt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration(loader = HeadlessFalseContextLoader.class)
class TestTaskHttApplicationTests {
    @Test
    void contextLoads() {
    }
}
