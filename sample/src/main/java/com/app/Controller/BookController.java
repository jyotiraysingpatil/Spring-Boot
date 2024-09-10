package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.BookDto;
import com.app.Services.BookService;
import com.app.entities.Book;

@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
private BookService bookService;

@PostMapping("insert")
public ResponseEntity<String> addNew(@RequestBody BookDto bookDto){
	Book b = bookService.addNewBook(bookDto);
	return ResponseEntity.ok("book added"+b);
}

@PutMapping("update/{bid}")
public ResponseEntity<String> update (@RequestBody BookDto bookDto){
	Book b = bookService.addNewBook(bookDto);
	return ResponseEntity.ok("book added"+b);
}

@GetMapping("getById/{bid}")
public Book getById(@PathVariable Long bid) {
return bookService.getById(bid);
}

@GetMapping("getAll")
public ResponseEntity<String> getAll(){
	List<Book> b= bookService.getAllBooks();
	return ResponseEntity.ok("all books are : "+b);
}

@DeleteMapping("delete/{bid}")
public ResponseEntity<String> delete(Long bid){
	bookService.delete(bid);
	return ResponseEntity.ok("deleted successfully");
}










}
