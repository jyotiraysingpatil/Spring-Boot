package com.app.Services;

import java.util.List;

import com.app.Dto.BookDto;
import com.app.entities.Book;

public interface BookService {
Book addNewBook(BookDto bookDto);
Book getById(Long bid);
Book update(Book book);
List<Book> getAllBooks();
void delete(Long bid);

}
