package com.ORDER.SERVICE.ORDER_SERVICE.Repository;

import com.ORDER.SERVICE.ORDER_SERVICE.Entity.OderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<OderEntity,Long> {

//    void updateInventoryQuantity(Long productId, int newQuantity);
}
