package com.stud.Services;

import com.stud.Entities.Course;

public interface CourseService {

	Course addNewCourse(Course course);
	Course updateCourseFees(Long id,float fees);
}
