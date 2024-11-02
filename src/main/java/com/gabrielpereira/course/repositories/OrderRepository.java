package com.gabrielpereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpereira.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
