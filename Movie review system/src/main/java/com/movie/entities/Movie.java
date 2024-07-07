package com.movie.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.ToString;
@ToString
@Entity
@Table(name="movie")
public class Movie {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String description;

	    @OneToMany(mappedBy = "movie")
	    private List<Review> reviews;
	public Long getId() {
		return id;
	}

	
	
	public Movie(Long id, String title, String description, List<Review> reviews) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.reviews = reviews;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public Movie() {
		
	}

}
