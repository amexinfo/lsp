package com.danmaicrosevice.order.service.service;

import com.danmaicrosevice.order.service.entity.Order;
import com.danmaicrosevice.order.service.model.OredrRequst;
import com.danmaicrosevice.order.service.repoisory.OderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class OderServiceImp implements OderService{
    @Autowired
    OderRepository oderRepository;
    @Override
    public long placeOrder(OredrRequst orderRequst) {
        Order order= Order.builder()
                .amount(orderRequst.getTotalAmount())
                .orderStatues("created")
                .proudactId(orderRequst.getProudactId())
                .orderDate(Instant.now())
                .quantity(orderRequst.getQuantity())
                .build();
        Order saveorder=oderRepository.save(order);

        log.info("successfull creat" ,order);
        return order.getOrderid();
    }
}
