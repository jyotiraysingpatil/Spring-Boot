package com.movie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.RequiredArgsConstructor;

@Entity
@Table(name="review")
public class Review {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contents;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    
	public Long getId() {
		return id;
	}
	
	public Review(Long id, String contents, int rating, User user, Movie movie) {
		super();
		this.id = id;
		this.contents = contents;
		this.rating = rating;
		this.user = user;
		this.movie = movie;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
	@Override
	public String toString() {
		return "Review [id=" + id + ", contents=" + contents + ", rating=" + rating + ", user=" + user + ", movie="
				+ movie + "]";
	}


	public Review() {}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	
	
	
}
