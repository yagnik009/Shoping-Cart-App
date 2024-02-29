package com.ORDER.SERVICE.ORDER_SERVICE.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;


@Data
public class inventories {
    @Id
    private Long id;
    private Long productId;
    private double price;
    private Integer quantity = 0;
    private Long code;
    private String productcategory;
}
