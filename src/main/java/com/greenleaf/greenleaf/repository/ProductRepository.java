package com.greenleaf.greenleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenleaf.greenleaf.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
