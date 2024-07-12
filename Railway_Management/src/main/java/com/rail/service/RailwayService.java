package com.rail.service;

import java.util.List;

import com.rail.entities.Category;
import com.rail.entities.Railway;

public interface RailwayService {

	  Railway addNewRailway(Railway railway);
	
	  List<Railway> findByCategory(Category category);
	
	  void deleteRailway(Long id);
	  
	  Railway updateRailwayDetails(Railway railway);
	  
	  List<Railway> getAllRailways();
	  
}
