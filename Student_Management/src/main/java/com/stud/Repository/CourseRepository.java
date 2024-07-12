package com.stud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stud.Entities.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
