package com.greenleaf.greenleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenleaf.greenleaf.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
