package com.colak.springjpaintutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@IdClass(ProductId.class)
@Table(name = "products")

@Getter
@Setter
public class Product {
    // The fields that make up the key are declared in the entity and marked as @Id
    @Id
    @Column(name = "name")
    private String name;

    // The fields that make up the key are declared in the entity and marked as @Id
    @Id
    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;
}
