package ru.nikitin.test_task_htt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.nikitin.test_task_htt.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT DISTINCT c FROM Category c LEFT JOIN FETCH c.products p ORDER BY c.name, p.name")
    List<Category> getAllWithProducts();
}
