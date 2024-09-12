package com.colak.springjpaintutorial.repository;

import com.colak.springjpaintutorial.jpa.idasclass.Product;
import com.colak.springjpaintutorial.jpa.idasclass.ProductId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository repository;

    @Test
    void findById() {
        ProductId productId = new ProductId("Product 1", new BigDecimal("10.99"));
        // select p1_0.name,p1_0.price,p1_0.description from products p1_0 where (p1_0.name,p1_0.price) in ((?,?))
        Optional<Product> optional = repository.findById(productId);

        assertThat(optional).isNotEmpty();
        assertThat(optional.get().getName()).isEqualTo("Product 1");
    }
}
