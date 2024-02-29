package com.ReturnService.Return.Entiry;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "Return_table")
@Data
public class Return {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private String customerEmail;
    private String customerAddress;
    private BigDecimal productPrice;

}
