package com.luizviana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizviana.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
