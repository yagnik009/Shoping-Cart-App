package com.CatelogService.catlog.Controllor;

import com.CatelogService.catlog.Entity.Catlog;
import com.CatelogService.catlog.Service.CatlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/catalog")
public class CatlogControllor {

    @Autowired
    private CatlogService catlogService;

    @PostMapping
    public List<Catlog> save(@RequestBody List<Catlog> catlogs){
        return catlogService.saveproduct(catlogs);
    }
    @GetMapping
    public List<Catlog> get(){
        return catlogService.alldata();
    }
    @GetMapping("/{code}")
    public Catlog  getdata(@PathVariable Long code){
        return catlogService.getdata(code);
    }
}
