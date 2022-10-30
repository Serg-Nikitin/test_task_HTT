package ru.nikitin.test_task_htt.service;

import ru.nikitin.test_task_htt.model.Category;
import ru.nikitin.test_task_htt.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataForTest {

    public static List<Category> listCategories = List.of(
            new Category(1, "alcohol"),
            new Category(3, "berries"),
            new Category(4, "dairy products"),
            new Category(2, "fruit")
    );

    private static List<Product> alcoholProducts = List.of(new Product(6, "koumiss"), new Product(5, "wine"));
    private static List<Product> fruitProducts = List.of(new Product(8, "apple"), new Product(9, "banana"), new Product(7, "orange"));
    private static List<Product> dairyProducts = List.of(new Product(6, "koumiss"), new Product(12, "milk"), new Product(13, "yogurt"));
    private static List<Product> berriesProducts = List.of(new Product(10, "raspberry"), new Product(11, "strawberry"));

    public static List<Category> listWithProducts() {
        var list = new ArrayList<>(listCategories);
        list.get(0).setProducts(alcoholProducts);
        list.get(1).setProducts(berriesProducts);
        list.get(2).setProducts(dairyProducts);
        list.get(3).setProducts(fruitProducts);
        return list;
    }

}
