package com.colak.springjpaintutorial.repository;


import com.colak.springjpaintutorial.jpa.idasclass.Product;
import com.colak.springjpaintutorial.jpa.idasclass.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
