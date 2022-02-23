package com.example.demo.repository;

import com.example.demo.repository.entity.Order;
import com.example.demo.repository.entity.OrdersPlaced;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, PagingAndSortingRepository<Order, Long> {

}
