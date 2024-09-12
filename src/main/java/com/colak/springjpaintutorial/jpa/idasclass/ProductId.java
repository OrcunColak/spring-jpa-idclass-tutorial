package com.colak.springjpaintutorial.jpa.idasclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

// Implementing Serializable is recommended for classes representing composite keys (@Embeddable or @IdClass),
// as it adds flexibility and enhances integration with Hibernate features related to serialization.
// This is particularly important for optimizing data access, caching at the second-level cache, and ensuring the
// possibility of transferring composite keys in distributed systems or between different application components.
// Nevertheless, in basic usage scenarios where these aspects are not of interest, it is possible to do so without
// implementing Serializable composite keys.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductId implements Serializable {
    private String name;
    private BigDecimal price;
}
