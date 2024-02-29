package com.ORDER.SERVICE.ORDER_SERVICE.Entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class OderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private int quantity;
    private BigDecimal productPrice;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "UTC")
    private Date date;

    @OneToMany(cascade = CascadeType.ALL)
    List<Customer> customers;
    @PrePersist
    public void prePersist() {
        if (date == null) {
            date = new Date();
        }
    }
    public BigDecimal getPrice() {
        return productPrice.multiply(new BigDecimal(quantity));
    }


}
