package com.danmaicrosevice.ProductService.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long proudactId;
    @Column(name="product_name")
    private String name;
    private long  price;
    private long quantity;
}
