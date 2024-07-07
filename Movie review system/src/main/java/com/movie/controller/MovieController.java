package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entities.Movie;
import com.movie.service.MovieService;

@RestController
@RequestMapping
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public Movie addNewMovie(@RequestBody Movie movie) {
		return movieService.addNewMovie(movie);
}
	
	
	
	
	
	
	
	
}