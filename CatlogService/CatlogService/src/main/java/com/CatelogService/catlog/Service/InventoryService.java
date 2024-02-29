package com.CatelogService.catlog.Service;

import com.CatelogService.catlog.Entity.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "INVENTORY-SERVICE")
public interface InventoryService {

    @GetMapping("/product/catalog/{code}")
    List<Inventory> getInventoryofcode(@PathVariable Long code);

    @GetMapping("/product/alldata")
    List<Inventory> getAllProducts();


}


