package com.stud.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.Entities.Course;
import com.stud.Entities.Student;
import com.stud.Exception.ResourceNotFoundException;
import com.stud.Repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentRepository studentRepository;

	@Override
	public Student addNewStudent(Student student, Long id) {

		return studentRepository.save(student);
	}

	@Override
	public Student removeStudentDetails(Long id) {
		Optional<Student> o= studentRepository.findById(id);
		if(o.isPresent()) {
			studentRepository.deleteById(id);
			return o.get();
		}
		else {
			throw new ResourceNotFoundException("studnet not found");
		}
		
	}



	
}
