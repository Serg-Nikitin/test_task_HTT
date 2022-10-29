package ru.nikitin.test_task_htt.view;

import javax.swing.*;
import java.awt.*;

public class ProductsLabel {

    private JLabel label;

    public ProductsLabel(String text) {
        label = createLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    private JLabel createLabel(String text) {
       var label = new JLabel(text);
       return label;
    }

    public JLabel getLabel() {
        return label;
    }
}
