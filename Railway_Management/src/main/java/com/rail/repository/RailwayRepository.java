package com.rail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rail.entities.Category;
import com.rail.entities.Railway;

@Repository

public interface RailwayRepository extends JpaRepository<Railway, Long>{

	List<Railway> findByCategory(Category category);
	
}
