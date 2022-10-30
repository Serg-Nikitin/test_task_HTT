package ru.nikitin.test_task_htt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nikitin.test_task_htt.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
