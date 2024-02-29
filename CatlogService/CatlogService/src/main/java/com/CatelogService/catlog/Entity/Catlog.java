package com.CatelogService.catlog.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Data
@Table(name = "Catalog")
public class Catlog {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private Long code;
    private String catlogname;
    private String description;
    @Transient
    private boolean isstock=true;
    transient private List<Inventory> inventories;

    public Catlog(Long id, Long code, String catlogname, String description) {
        this.id = id;
        this.code = code;
        this.catlogname = catlogname;
        this.description = description;
        this.isstock = isstock;
    }
   public Catlog(){}

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }

    //    public void setCode(){
//        UUID uuid=UUID.randomUUID();
//        String uu=uuid.toString().replace("-","");
//        this.code=uu.substring(0,5);
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }



    public String getCatlogname() {
        return catlogname;
    }

    public void setCatlogname(String catlogname) {
        this.catlogname = catlogname;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsstock() {
        return isstock;
    }

    public void setIsstock(boolean isstock) {
        this.isstock = isstock;
    }
}
