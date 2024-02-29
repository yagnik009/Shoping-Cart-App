package com.ReturnService.Return.Service;


import com.ReturnService.Return.Entiry.OderEntity;
import com.ReturnService.Return.Entiry.Return;
import com.ReturnService.Return.Repository.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReturnService {

   @Autowired
   private ReturnRepository returnRepository;

   private OrderServiceClient orderServiceClient;

    public ReturnService(ReturnRepository returnRepository, OrderServiceClient orderServiceClient) {
        this.returnRepository = returnRepository;
        this.orderServiceClient = orderServiceClient;
    }

    public String save(Return e) {
        List<OderEntity> list = orderServiceClient.getAllorder();
        System.out.println(list);
        boolean orderReturn = false;
        for (OderEntity a : list) {
            if (Objects.equals(e.getProductId(), a.getProductId())) {
                e.setProductPrice(a.getProductPrice());
                orderReturn = true;
                break;
            } else {
                String s = "product id not found";
                return s;
            }
        }

        if (orderReturn) {
            returnRepository.save(e);
            String successMessage = "successfully";
            return successMessage;
        }

        String errorMessage = "order not found";
        return errorMessage;
    }
}
