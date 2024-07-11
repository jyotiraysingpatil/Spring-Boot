package com.app.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Railway;
import com.app.Exception.RailwayException;
import com.app.Repository.RailwayRepository;
@Service
@Transactional
public class RailwayServiceImpl implements RailwayService{
@Autowired
private RailwayRepository railwayRepository;
	
	@Override
	public Railway addNew(Railway railway) {
	
		return railwayRepository.save(railway);
	}

	@Override
	public Railway getById(Long id) {
		Optional<Railway> o=railwayRepository.findById(id);
		return o.orElseThrow(()->new RailwayException("invalid id"));
	}

	@Override
	public List<Railway> getAllRailway(Railway railway) {
		
		return railwayRepository.findAll();
	}

	@Override
	public Railway update( Railway railway) {
		return railwayRepository.save(railway);
	}

	@Override
	public void deleteById(Long id) {
		
		railwayRepository.deleteById(id);
	}

}
