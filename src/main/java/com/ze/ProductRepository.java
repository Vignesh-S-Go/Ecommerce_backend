package com.ze;

import com.ze.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface ProductRepository extends JpaRepository<Product, Long> {
}