package ru.nikitin.test_task_htt.view;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

@Slf4j
public class CategoriesBtn {

    private JToggleButton btn;

    public CategoriesBtn(String text) {
        this.btn = initBtn(text);
    }

    private JToggleButton initBtn(String text) {
        var btn = new JToggleButton(text);
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                todo
                log.info("Button click ");
            }
        });
        btn.setBorder(new LineBorder(Color.BLACK));
        btn.setSize(new Dimension(50, 200));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        return btn;
    }

    public JToggleButton getBtn() {
        return btn;
    }
}
