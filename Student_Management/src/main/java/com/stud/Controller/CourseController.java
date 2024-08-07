package com.stud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stud.Entities.Course;
import com.stud.Services.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {
@Autowired
private CourseService courseService;
	
@PostMapping
public ResponseEntity <String> addNewCourse(@RequestBody Course course) {
	 courseService.addNewCourse(course);
	 return ResponseEntity.ok("course added ");
}   

@PutMapping("/{id}/fees")
public ResponseEntity<String> updateCourseFees(@PathVariable Long id, @RequestParam float fees) {
    courseService.updateCourseFees(id, fees);
    return ResponseEntity.ok("Fees updated");
}





}
