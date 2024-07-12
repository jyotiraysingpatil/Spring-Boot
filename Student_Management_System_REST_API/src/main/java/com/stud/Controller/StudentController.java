package com.stud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stud.Entities.Student;
import com.stud.Exception.ResourceNotFoundException;
import com.stud.Services.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	 @PostMapping
	    public ResponseEntity<Student> addNewStudent(@RequestBody Student student, @RequestParam Long id) {
	        Student response = studentService.addNewStudent(student, id);
	        return ResponseEntity.ok(response);
	    }
	 
	 @DeleteMapping("/{id}/delete")
	 public ResponseEntity<?> removeStudentDetails(@PathVariable Long  id) {
		Student remove= studentService.removeStudentDetails(id);
		 return new ResponseEntity<>(remove,HttpStatus.OK);
	 }
	 
	 
	 

}



