package com.movie.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.entities.Movie;
import com.movie.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Movie addNewMovie(Movie movie) {
		
		return movieRepository.save(movie);
	}

	
	
	
}
