package br.com.devdojo.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student extends AbstractEntity {
    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
