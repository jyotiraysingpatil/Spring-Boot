package com.movie.service;

import java.util.List;

import com.movie.ReviewDTO.ReviewDTO;
import com.movie.entities.Review;
import com.movie.exception.ResourceNotFoundException;

public interface ReviewService {
	
Review addReview(ReviewDTO reviewDto) throws ResourceNotFoundException;

List<Review> getAllReview();

Review getById(Long id) throws ResourceNotFoundException;

Review updateReview(Long id,ReviewDTO reviewDto)throws ResourceNotFoundException;

 Review removeReview(Long id) throws ResourceNotFoundException;

}
