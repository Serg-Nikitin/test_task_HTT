package ru.nikitin.test_task_htt.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.awt.*;


@Component
@Slf4j
@Profile("view")
public class WindowLaunch implements CommandLineRunner {

    private final Display window;

    public WindowLaunch(Display window) {
        this.window = window;
    }

    @Override
    public void run(String... args) throws Exception {
        EventQueue.invokeLater(window::init);
    }
}
