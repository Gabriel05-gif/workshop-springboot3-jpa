package com.gabrielpereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpereira.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
