package ru.nikitin.test_task_htt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;

public class HeadlessFalseContextLoader extends SpringBootContextLoader {
    @Override
    protected SpringApplication getSpringApplication() {
        var application = super.getSpringApplication();
        application.setHeadless(false);
        return application;
    }
}
