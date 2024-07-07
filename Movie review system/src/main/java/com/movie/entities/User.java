package com.movie.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.ToString;
@ToString
@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	    private String name;

	    @OneToMany(mappedBy = "user")
	    private List<Review> reviews;

	    
	    
	public User(Long id, String name, List<Review> reviews) {
			super();
			this.id = id;
			this.name = name;
			this.reviews = reviews;
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public User() {}
}
