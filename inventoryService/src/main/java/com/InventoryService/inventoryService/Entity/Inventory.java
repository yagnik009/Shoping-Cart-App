package com.InventoryService.inventoryService.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Inventory {
    @Id
    private Long id;
    private Long code;
    private Long productId;
    private double price;
    private Integer quantity=0;
    private String productcategory;

Inventory(){

}
    public Inventory(Long id, Long code, double price, Integer quantity, Long productId, String productcategory) {
        this.id=id;
        this.code= code;
        this.price=price;
        this.productId=productId;
        this.quantity=quantity;
        this.productcategory=productcategory;

    }

}
