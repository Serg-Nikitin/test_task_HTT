package ru.nikitin.test_task_htt.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.nikitin.test_task_htt.model.Category;
import ru.nikitin.test_task_htt.model.Product;
import ru.nikitin.test_task_htt.service.CategoryService;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
@Slf4j
@Profile("view")
public class MainWindow extends JFrame implements Display {
    private JPanel basePanel;
    private JPanel productsWithCategories;
    private final static String HEADER_CATEGORIES = "Categories";
    private final static String HEADER_PRODUCTS = "Products";

    private final CategoryService service;

    public MainWindow(CategoryService service) {
        this.service = service;
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        setContentPane(basePanel);
        populatePanel();
        this.setVisible(true);
    }

    private void populatePanel() {
        var list = service.getAllWithProducts();
        int count =
                list.stream().map(el -> el.getProducts().size()).reduce(0, (acc, el) -> {
                    acc += el;
                    return acc;
                });

        GridLayout layout = new GridLayout(count + 1, 2);
        productsWithCategories.setLayout(layout);
        productsWithCategories.add(new NameLabel(HEADER_CATEGORIES).getLabel());
        productsWithCategories.add(new NameLabel(HEADER_PRODUCTS).getLabel());

        for (Category category : list) {
            List<Product> products = category.getProducts();
            for (Product product : products) {
                productsWithCategories.add(new NameLabel(category.getName()).getLabel());
                productsWithCategories.add(new NameLabel(product.getName()).getLabel());
            }
        }
    }
}
