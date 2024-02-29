package com.CatelogService.catlog.Service;


import com.CatelogService.catlog.Entity.Catlog;
import com.CatelogService.catlog.Entity.Inventory;
import com.CatelogService.catlog.Repository.CatalogRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CatlogService {

    @Autowired
    private CatalogRepository catalogRepository;

    public CatlogService(CatalogRepository catalogRepository, InventoryService inventoryService) {
        this.catalogRepository = catalogRepository;
        this.inventoryService = inventoryService;
    }
    @Autowired
   private final InventoryService inventoryService;


    public List<Catlog> saveproduct(List<Catlog> catlogs) {
        return catalogRepository.saveAll(catlogs);
    }

    public List<Catlog> alldata() {
        List<Catlog> list = catalogRepository.findAll();
        for (Catlog e : list) {
            try {
                List<Inventory> inventories = inventoryService.getInventoryofcode(e.getCode());
                System.out.println(inventories);
                e.setInventories(inventories);
            } catch (FeignException ex) {
                ex.printStackTrace();
                e.setInventories(Collections.emptyList());
            }
        }
        return list;
    }

    public Catlog  getdata (Long code) {
        Catlog catlog=catalogRepository.findById(code).orElseThrow(()-> new RuntimeException("catalog not found"));
        catlog.setInventories(inventoryService.getInventoryofcode(catlog.getCode()));
        return catlog;
    }
}
