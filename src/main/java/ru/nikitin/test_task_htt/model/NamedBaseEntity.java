package ru.nikitin.test_task_htt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
abstract class NamedBaseEntity extends BaseEntity {

    @Column(name = "name")
    protected String name;

    protected NamedBaseEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.getName() + ")";
    }

}
