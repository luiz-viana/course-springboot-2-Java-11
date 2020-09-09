package com.luizviana.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizviana.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
