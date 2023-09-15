package com.danmaicrosevice.order.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OredrRequst {
    private long proudactId;
    private long totalAmount;
    private long quantity;
    private PaymentMod paymentMod;
}
