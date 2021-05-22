package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "PRODUCT")
@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private Long stockQuantity;

    @JoinColumn(name = "CATEGORY_ID", unique = true)
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
