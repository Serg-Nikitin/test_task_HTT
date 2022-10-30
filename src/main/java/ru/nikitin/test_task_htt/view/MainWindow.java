package ru.nikitin.test_task_htt.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
@Slf4j
@Profile("view")
public class MainWindow extends JFrame {
    private JPanel categories;
    private JPanel products;
    private JPanel basePanel;

    public void init() {
        changeLeft();
        changeRight();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setContentPane(basePanel);
        this.setVisible(true);
    }

    private void changeLeft() {
        settingUp(categories);
        var group = new ButtonGroup();
        int quantity = 3;
        for (int i = 0; i < quantity; i++) {
            var btn = new CategoriesBtn("name " + i);

            group.add(btn.getBtn());
            log.info("button value = " + btn);
            categories.add(btn.getBtn());
        }
    }

    private void changeRight() {
        settingUp(products);
        var quantity = 10;
        for (int i = 0; i < quantity; i++) {
            products.add(new ProductsLabel("name " + i).getLabel());
        }
    }

    private void settingUp(JPanel panel) {
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
    }
}
