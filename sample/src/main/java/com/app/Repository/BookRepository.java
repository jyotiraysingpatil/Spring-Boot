package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
