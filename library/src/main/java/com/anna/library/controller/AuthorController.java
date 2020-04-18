package com.anna.library.controller;


import com.anna.library.entity.Author;
import com.anna.library.entity.AuthorBook;
import com.anna.library.entity.Book;
import com.anna.library.repository.AuthorBookRepository;
import com.anna.library.repository.AuthorRepository;
import com.anna.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorBookRepository authorbookRepository;

    @GetMapping("/all")   //  get all authors from db
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")  //  get author by id
    public Author getAuthorById(@PathVariable int id){
        return authorRepository.findById(id).get();
    }

    @GetMapping("/find/")  //  find author by name
    public List<Author> getByNameContaining(@RequestParam("name") String name){
        return authorRepository.findAllByNameContains(name);
    }

    @PostMapping("/create")   //  create author
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.saveAndFlush(author);
    }

    @PostMapping("/assign")   //  assign book to author
    public AuthorBook assignBookToAuthor(@RequestBody AuthorBook authorbook) {
        return authorbookRepository.saveAndFlush(authorbook);
    }

    @PutMapping("/update/{id}") //  update author
    public Author updateAuthor(@PathVariable int id, @RequestBody Author author){
        author.setId(id);
        return authorRepository.saveAndFlush(author);
    }


}
