package com.luizviana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizviana.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
