package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
