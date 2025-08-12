package com.greenleaf.greenleaf.controller;


import org.springframework.web.bind.annotation.*;

import com.greenleaf.greenleaf.models.Order;
import com.greenleaf.greenleaf.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}
