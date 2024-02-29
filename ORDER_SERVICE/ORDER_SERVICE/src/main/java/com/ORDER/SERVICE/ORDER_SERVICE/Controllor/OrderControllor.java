package com.ORDER.SERVICE.ORDER_SERVICE.Controllor;


import com.ORDER.SERVICE.ORDER_SERVICE.Entity.OderEntity;
import com.ORDER.SERVICE.ORDER_SERVICE.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderControllor {

    @Autowired
    OrderService orderService;

    @PostMapping("/save")
    public String save(@RequestBody OderEntity e){
        return orderService.save(e);
    }

    @GetMapping("/allorder/{id}")
    public Optional<OderEntity> all(@PathVariable Long id){
        return orderService.all(id);
    }

    @GetMapping("/alldata")
    public List<OderEntity>getAllorder(){
        return orderService.getAllorder();
    }

}
