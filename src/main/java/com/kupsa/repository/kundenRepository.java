package com.kupsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kupsa.entity.kunde;

public interface kundenRepository extends JpaRepository<kunde, Integer>{
	
}
