package com.stud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stud.Entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
