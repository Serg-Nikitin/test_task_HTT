package ru.nikitin.test_task_htt.view;

import javax.swing.*;
import java.awt.*;

public class NameLabel {

    private JLabel label;

    public NameLabel(String text) {
        label = createLabel(text);
    }

    private JLabel createLabel(String text) {
       var label = new JLabel(text);
       return label;
    }

    public JLabel getLabel() {
        return label;
    }
}
