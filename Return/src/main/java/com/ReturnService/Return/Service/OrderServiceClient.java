package com.ReturnService.Return.Service;

import com.ReturnService.Return.Entiry.OderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderServiceClient {
    @GetMapping("/order/alldata")
    List<OderEntity> getAllorder();
}
