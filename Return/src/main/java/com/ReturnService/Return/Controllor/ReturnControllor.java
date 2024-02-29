package com.ReturnService.Return.Controllor;


import com.ReturnService.Return.Entiry.Return;
import com.ReturnService.Return.Service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class ReturnControllor {

    @Autowired
    private ReturnService returnService;

    @PostMapping("/save")
    public String save(@RequestBody Return e){
        return returnService.save(e);
    }
}
