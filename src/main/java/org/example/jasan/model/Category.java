package org.example.jasan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.jasan.model.dto.CategoryDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@Entity(name = "category")
public class Category {
    @Id
    private int id;

    private String name;

    public Category(CategoryDto categoryDto){
        this.name = categoryDto.getName();
    }
}
