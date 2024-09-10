package com.app.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dto.BookDto;
import com.app.Exception.AuthorException;
import com.app.Exception.BookException;
import com.app.Repository.AuthorRepository;
import com.app.Repository.BookRepository;
import com.app.entities.Author;
import com.app.entities.Book;
@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;
	
	

	@Override
	public Book getById(Long bid) {
		Optional<Book> o= bookRepository.findById(bid);
		return o.orElseThrow(()->new BookException("book not found"));
	}

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public void delete(Long bid) {
		bookRepository.deleteById(bid);
	}

	public Book addNewBook(BookDto bookDto) {
        // Convert BookDto to Book entity
        Book book = mapToEntity(bookDto);
        return bookRepository.save(book);
    }
	private Book mapToEntity(BookDto bookDto) {
		Book b= new Book();
		b.setBid(bookDto.getBid());
Author author = authorRepository.findById(bookDto.getAid()).orElseThrow(()-> new AuthorException("Author not found with id: "+bookDto.getAid()));
	b.setAuthor(author);
	b.setTitle(bookDto.getTitle());
	b.setPrice(bookDto.getPrice());
	b.setQuantity(bookDto.getQuantity());
	b.setPublishedAt(bookDto.getPublishedAt());
	return b;
	}
}
