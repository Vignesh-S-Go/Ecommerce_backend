package com.ze;

import com.ze.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}