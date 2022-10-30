package ru.nikitin.test_task_htt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "product")
@NoArgsConstructor
public class Product extends NamedBaseEntity {

    @ManyToMany()
    @JoinTable(name = "common_table", joinColumns =
    @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_category"))
    private List<Category> categories;

    public Product(Integer id, String name) {
        super(id, name);
    }
}
