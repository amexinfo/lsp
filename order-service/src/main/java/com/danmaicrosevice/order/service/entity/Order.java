package com.danmaicrosevice.order.service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.CloseableThreadContext;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderid;
    private long proudactId;
    private Instant orderDate;
    private String orderStatues;
    private long  amount;
    private Long quantity;


}
