package com.ORDER.SERVICE.ORDER_SERVICE.Service;

import com.ORDER.SERVICE.ORDER_SERVICE.Entity.OderEntity;
import com.ORDER.SERVICE.ORDER_SERVICE.Entity.inventories;
import com.ORDER.SERVICE.ORDER_SERVICE.Repository.CatlogServiceClient;
import com.ORDER.SERVICE.ORDER_SERVICE.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class OrderService {




    @Autowired
    private Repository repository;

    @Autowired
    private CatlogServiceClient catlogServiceClient;

    public String save(OderEntity e) {
        List<inventories> list = catlogServiceClient.getAllProducts();
        System.out.println(list);
        boolean orderFound = false;

        for (inventories i : list) {
            if (Objects.equals(i.getProductId(), e.getProductId())) {
                if (i.getQuantity() >= e.getQuantity()) {
//                    int newQuantity = i.getQuantity() - e.getQuantity();
                    i.setQuantity(i.getQuantity()-e.getQuantity());
//                    repository.updateInventoryQuantity(i.getProductId(), newQuantity);
                    orderFound = true;
                    break;
                } else {
                    String d="Not enough quantity available for order";
                    return d;   
                }
            }
        }

        if (orderFound) {
            repository.save(e);
            String c="successfully";
            return c;
        }
            String v="Product not found for the given order.";
            return v;
    }

    public Optional<OderEntity> all(Long id) {
        return repository.findById(id);

    }

    public List<OderEntity> getAllorder() {
        return repository.findAll();
    }
}
