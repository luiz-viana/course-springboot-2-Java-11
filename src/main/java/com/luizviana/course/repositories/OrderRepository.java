package com.luizviana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizviana.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
