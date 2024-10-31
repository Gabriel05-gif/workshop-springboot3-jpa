package com.gabrielpereira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpereira.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
