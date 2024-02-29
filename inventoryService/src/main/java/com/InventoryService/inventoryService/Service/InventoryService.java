package com.InventoryService.inventoryService.Service;

import com.InventoryService.inventoryService.Entity.Inventory;
import com.InventoryService.inventoryService.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> save(List<Inventory> entities) {
        return inventoryRepository.saveAll(entities);
    }

    public List<Inventory> getAllProducts() {
        return inventoryRepository.findAll();
    }

    public List<Inventory> getInventoryofcode(Long code) {
           return inventoryRepository.findBycode(code);
    }
}
