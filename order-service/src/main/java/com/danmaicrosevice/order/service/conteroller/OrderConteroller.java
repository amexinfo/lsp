package com.danmaicrosevice.order.service.conteroller;

import com.danmaicrosevice.order.service.model.OredrRequst;
import com.danmaicrosevice.order.service.service.OderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderConteroller {
    @Autowired
    OderService oderService;
    @PostMapping
    public ResponseEntity<Long>placeOrder(OredrRequst orderRequst){
        long oderid=oderService.placeOrder(orderRequst);
        log.info("oder Id",oderid);
        return new ResponseEntity<>(oderid, HttpStatus.OK);

    }

}
