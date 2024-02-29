package com.ORDER.SERVICE.ORDER_SERVICE.Repository;

import com.ORDER.SERVICE.ORDER_SERVICE.Entity.inventories;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "INVENTORY-SERVICE")
public interface CatlogServiceClient {
    @GetMapping("/product/alldata")
    List<inventories> getAllProducts();

}
