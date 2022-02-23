package com.example.demo.controller;

import com.example.demo.controller.dto.OrderDTO;
import com.example.demo.controller.dto.mapper.OrderMapper;
import com.example.demo.repository.entity.Order;
import com.example.demo.repository.entity.OrdersPlaced;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("orders")
public class SuperMarketOrders {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/{id}")
    @ResponseBody
    public OrderDTO getById(@PathVariable Long id) {
        return orderMapper.toDto(orderService.getOrderById(id));
    }
    // Todo 1: replicate getter but by queryParam instead of path variable
    @GetMapping()
    public OrderDTO getByParamId(@RequestParam Long id){
        return orderMapper.toDto(orderService.getOrderById(id));
    }

    // Todo 2: List all orders with pagination
    @GetMapping("/paginated")
    public List<OrderDTO> getPaginated(@RequestParam int page, @RequestParam int quantity){
        List<Order> orders = orderService.getPaginated(page, quantity);
        List<OrderDTO> orderDTOS = new ArrayList<>();

        if(!orders.isEmpty()){
            for (Order o:orders ) {
                orderDTOS.add(orderMapper.toDto(o));
            }
        }

        return orderDTOS;
    }

    // Todo 3: Business inquiry 1: list hours of the day with more order placed in desc order

}
