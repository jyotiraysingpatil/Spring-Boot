package com.stud.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String firstName;
	
	private String lastName;
	private String email;
	private float score;
	
	
	@ManyToOne
	@JoinColumn(name="course_id",nullable=false)
	private Course course;


	public Student(Long id, String firstName, String lastName, String email, float score, Course course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.score = score;
		this.course = course;
	}
	
	
	
}
