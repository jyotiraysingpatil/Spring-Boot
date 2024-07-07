package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ReviewDTO.ReviewDTO;
import com.movie.entities.Review;
import com.movie.exception.ResourceNotFoundException;
import com.movie.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@PostMapping
    public ResponseEntity<Review> addReview(@RequestBody ReviewDTO reviewDto) throws ResourceNotFoundException {
        Review review = reviewService.addReview(reviewDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(review);
    }
	
	@GetMapping
	public List<Review> getAllReview(){
		return reviewService.getAllReview();
	}
	
	@GetMapping("/{id}")
	public Review getById(Long id) throws ResourceNotFoundException {
		return reviewService.getById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Review> updateReview(Long id, ReviewDTO reviewDto) throws ResourceNotFoundException {
Review review=reviewService.updateReview(id, reviewDto);
return ResponseEntity.ok(review);
	}
	
	@DeleteMapping("/{id}")
	public Review removeReview(@PathVariable Long id)throws ResourceNotFoundException{
		return reviewService.removeReview(id);
		
	}
	
	}