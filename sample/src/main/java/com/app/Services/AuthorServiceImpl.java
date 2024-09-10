package com.app.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Exception.AuthorException;
import com.app.Repository.AuthorRepository;
import com.app.entities.Author;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
@Autowired
private AuthorRepository authorRepository;
	
	@Override
	public Author addNewAuthor(Author author) {
		
		return authorRepository.save(author);
	}

	@Override
	public Author update(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public Author getById(Long aid) {
	Optional<Author> o=	authorRepository.findById(aid);
	return o.orElseThrow(()->new AuthorException("not found"));
	
	}

	@Override
	public List<Author> getAll() {
		
		return authorRepository.findAll();
	}

	@Override
	public void delete(Long aid) {
		authorRepository.deleteById(aid);
		
	}

}
