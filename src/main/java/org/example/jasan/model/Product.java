package org.example.jasan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.jasan.model.dto.ProductDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
@Entity(name = "products")
public class Product {
    @Id
    private int id;

    private String name;
    private String description;
    private double price;
    private int amount;

    @Column(name = "category_id")
    private int categoryId;

    public Product(ProductDto productDto){
        this.name = productDto.getName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.amount = productDto.getAmount();
    }
}
