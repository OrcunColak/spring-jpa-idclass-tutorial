package com.colak.springjpaintutorial.repository;


import com.colak.springjpaintutorial.jpa.Product;
import com.colak.springjpaintutorial.jpa.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
