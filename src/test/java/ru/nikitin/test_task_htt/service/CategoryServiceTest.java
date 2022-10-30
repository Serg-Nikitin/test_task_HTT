package ru.nikitin.test_task_htt.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.nikitin.test_task_htt.model.Category;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@ActiveProfiles("default")
public class CategoryServiceTest {

    @Autowired
    private CategoryService service;

    private static List<Category> LIST = List.of(
            new Category(1, "alcohol"),
            new Category(2, "fruit"),
            new Category(3, "berries"),
            new Category(4, "dairy products")
    ).stream().sorted(Comparator.comparing(Category::getName)).collect(Collectors.toList());


    @Test
    public void shouldReturnListCategory() {
        var categories = service.getAll();
        Assertions.assertIterableEquals(LIST, categories);
    }
}