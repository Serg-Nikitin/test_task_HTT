package ru.nikitin.test_task_htt.view;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;


@Component
public class WindowLaunch implements CommandLineRunner {

    private final MainWindow window;


    public WindowLaunch(MainWindow window) {
        this.window = window;
    }

    @Override
    public void run(String... args) throws Exception {
        EventQueue.invokeLater(window::init);
    }
}
