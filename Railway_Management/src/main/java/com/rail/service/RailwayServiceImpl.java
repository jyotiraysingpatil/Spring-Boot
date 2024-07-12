package com.rail.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rail.entities.Category;
import com.rail.entities.Railway;
import com.rail.exception.RailwayException;
import com.rail.repository.RailwayRepository;

@Service
@Transactional
public  class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railwayRepository;

	@Override
	public Railway addNewRailway(Railway railway) {
		
		return railwayRepository.save(railway);
	}

	@Override
	public List<Railway> findByCategory(Category category) {
		
		return railwayRepository.findByCategory(category);
	}

	@Override
	public void deleteRailway(Long id) {
	railwayRepository.deleteById(id);
		
	}

	@Override
	public Railway updateRailwayDetails(Railway railway) {
		
		 return railwayRepository.save(railway);
	}

	@Override
	public List<Railway> getAllRailways() {
		
		return railwayRepository.findAll();
	}
	
	
	
	
	
	
}
