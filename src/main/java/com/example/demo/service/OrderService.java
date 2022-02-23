package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.entity.Order;
import com.example.demo.repository.entity.OrdersPlaced;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        return orderRepository.getById(id);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getPaginated(int page, int quantity){
        Pageable pageable = PageRequest.of(page, quantity);
        return orderRepository.findAll(pageable).toList();
    }
}
