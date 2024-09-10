package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Services.AuthorService;
import com.app.entities.Author;

@RestController
@RequestMapping("/author")
public class AuthorController {
@Autowired
private AuthorService authorService;

@PostMapping("insertAuthor")
public ResponseEntity<String> insert(@RequestBody Author author){
	Author a= authorService.addNewAuthor(author);
	return ResponseEntity.ok("added author "+a);
}

@GetMapping("getAll")
public ResponseEntity<String> getALL(){
	List<Author> a= authorService.getAll();
	return ResponseEntity.ok("all authors"+a);
	
}


















}
