package com.gabrielpereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpereira.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
