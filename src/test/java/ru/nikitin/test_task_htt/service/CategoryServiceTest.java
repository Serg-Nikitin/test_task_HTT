package ru.nikitin.test_task_htt.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static ru.nikitin.test_task_htt.service.DataForTest.listCategories;
import static ru.nikitin.test_task_htt.service.DataForTest.listWithProducts;

@Slf4j
@SpringBootTest
@ActiveProfiles("default")
public class CategoryServiceTest {

    @Autowired
    private CategoryService service;


    @Test
    public void shouldReturnListCategorySortedByName() {
        var categories = service.getAll();
        Assertions.assertIterableEquals(listCategories, categories);
    }

    @Test
    public void shouldReturnListCategoryWithProducts() {
        var categories = service.getAllWithProducts();

        Assertions.assertIterableEquals(listWithProducts(), categories);

        for (int i = 0; i < categories.size(); i++) {
            var actual = categories.get(i).getProducts();
            var excepted = listWithProducts().get(i).getProducts();

            Assertions.assertIterableEquals(excepted, actual);
        }
    }
}