package com.InventoryService.inventoryService.Controllor;

import com.InventoryService.inventoryService.Entity.Inventory;
import com.InventoryService.inventoryService.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class InventoryControllor {

    @Autowired
    private InventoryService inventoryService;

    public InventoryControllor(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }


    @PostMapping("save")
    public ResponseEntity<List<Inventory>> saveProducts(@RequestBody List<Inventory> entities) {
        List<Inventory> savedEntities = inventoryService.save(entities);
        return new ResponseEntity<>(savedEntities, HttpStatus.OK);
    }

    @GetMapping("/catalog/{code}")
    public List<Inventory> getInventoryofcode(@PathVariable Long code){
              return inventoryService.getInventoryofcode(code);
    }

     @GetMapping(value = "/alldata")
    public List<Inventory> getAllProducts(){
        return inventoryService.getAllProducts();
     }

}
