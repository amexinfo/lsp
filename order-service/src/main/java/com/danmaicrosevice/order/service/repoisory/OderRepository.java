package com.danmaicrosevice.order.service.repoisory;

import com.danmaicrosevice.order.service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepository extends JpaRepository<Order,Long> {
}
