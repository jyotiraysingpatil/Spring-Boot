package com.movie.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ReviewDTO.ReviewDTO;
import com.movie.entities.Movie;
import com.movie.entities.Review;
import com.movie.entities.User;
import com.movie.exception.ResourceNotFoundException;
import com.movie.repository.MovieRepository;
import com.movie.repository.ReviewRepository;
import com.movie.repository.UserRepository;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	public ReviewRepository reviewRepository;
	
	@Autowired
	public MovieRepository movieRepository;
	
	@Autowired
	public UserRepository userRepository;
	


	//add reviews
	public Review addReview(ReviewDTO reviewDto) throws ResourceNotFoundException {
        User user = userRepository.findById(reviewDto.getUserId()).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        Movie movie = movieRepository.findById(reviewDto.getMovieId()).orElseThrow(() -> new ResourceNotFoundException("Movie not found"));

        Review review = new Review();
        review.setContents(reviewDto.getContents());
        review.setRating(reviewDto.getRating());
        review.setUser(user);
        review.setMovie(movie);

        return reviewRepository.save(review);
    }

	//get all review
@Override
public List<Review> getAllReview() {
	return reviewRepository.findAll();
}

//get By id
@Override
public Review getById(Long id) throws ResourceNotFoundException {
	Optional<Review> o=reviewRepository.findById(id);
	return o.orElseThrow(()->new ResourceNotFoundException("invalid id !!!"));
}

//update review

public Review updateReview(Long id, ReviewDTO reviewDto) throws ResourceNotFoundException {
Review review=reviewRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("review not found "));
review.setContents(reviewDto.getContents());
review.setRating(reviewDto.getRating());
return reviewRepository.save(review);
}

//delete
public Review removeReview(Long id) throws ResourceNotFoundException {
	Optional<Review> o=reviewRepository.findById(id);
	if(o.isPresent()) {
		reviewRepository.deleteById(id);
		return o.get();
	}
	else {
		throw new ResourceNotFoundException("Invalid review id !!");
}

}

}
