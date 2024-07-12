package com.stud.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
private String CourseTitle;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private float fees;
	
	private int minScore;
	
	

	public Course(Long id, String courseTitle, LocalDate startDate, LocalDate endDate, float fees, int minScore
			) {
	
		this.id = id;
		CourseTitle = courseTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.minScore = minScore;
		
	}	
	
	
	
}
