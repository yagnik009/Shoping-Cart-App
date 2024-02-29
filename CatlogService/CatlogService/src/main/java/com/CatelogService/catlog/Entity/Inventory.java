package com.CatelogService.catlog.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class Inventory {
    @Id
    private Long id;
    private Long code;
    private Long productId;
    private double price;
    private Integer quantity=0;
    private String productcategory;

    public Inventory(Long id, Long code, Long productId, double price, Integer quantity, String productcategory) {
        this.id = id;
        this.code = code;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.productcategory = productcategory;
    }
}
