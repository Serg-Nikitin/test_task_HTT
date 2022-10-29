package ru.nikitin.test_task_htt;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestTaskHttApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestTaskHttApplication.class)
                .headless(false).web(WebApplicationType.NONE).run(args);
    }
}
