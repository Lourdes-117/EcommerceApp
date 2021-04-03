package com.lourdes.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lourdes.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
