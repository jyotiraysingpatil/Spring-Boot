package com.stud.Services;

import java.util.List;

import com.stud.Entities.Course;
import com.stud.Entities.Student;

public interface StudentService {
Student addNewStudent(Student student,Long id);

//List<Student> findByCourse(Course courseTitle);

Student removeStudentDetails(Long id);
}