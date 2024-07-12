package com.stud.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.Entities.Course;
import com.stud.Entities.Student;

import com.stud.Repository.CourseRepository;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
		

	public Course addNewCourse(Course course) {
		
		return courseRepository.save(course);
	}


	@Override
	public Course updateCourseFees(Long id, float fees) {
		Optional<Course> o=courseRepository.findById(id);
		if(o.isPresent()) {
		Course c=o.get();
		c.setFees(fees);
		return courseRepository.save(c);
		}
		return null;
	}

	
}
