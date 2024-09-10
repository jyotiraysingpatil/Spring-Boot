package com.app.Services;

import java.util.List;

import com.app.entities.Author;

public interface AuthorService {
Author addNewAuthor(Author author);
Author update (Author author);
Author getById(Long aid);
List<Author> getAll();
void delete(Long aid);
}
