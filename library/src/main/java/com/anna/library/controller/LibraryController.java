package com.anna.library.controller;

import com.anna.library.entity.Library;
import com.anna.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryRepository libraryRepository;

    @GetMapping("/all")   //  get all notes from db
    public List<Library> getAllNotes(){
        return libraryRepository.findAll();
    }

    @GetMapping("/{id}")  //  get note by id
    public Library getNoteById(@PathVariable int id){
        return libraryRepository.findById(id).get();
    }

//    @GetMapping("/findClient/")  //  find note by client's id
//    public List<Library> getByClient_id(@RequestParam("client_id") int id){
//        return libraryRepository.findAllByClient_id(id);
//    }
//
//    @GetMapping("/findBook/")  //  find note by book's id
//    public List<Library> getByBook_id(@RequestParam("book_id") int id){
//        return libraryRepository.findAllByBook_id(id);
//    }

    @PostMapping("/create")   //  create note
    public Library createNote(@RequestBody Library library) {
        return libraryRepository.saveAndFlush(library);
    }

    @PutMapping("/update/{id}") //  update note
    public Library updateNote(@PathVariable int id, @RequestBody Library library){
        library.setId(id);
        return libraryRepository.saveAndFlush(library);
    }

    @PatchMapping("/updateIssue/{id}")  //  update note's issue date
    public Library updateIssueDate(@PathVariable int id, @RequestBody Date date){
        Library library = libraryRepository.findById(id).get();
        library.setIssueDate(date);
        return libraryRepository.saveAndFlush(library);
    }

    @PatchMapping("/updateReturn/{id}")  //  update note's return date
    public Library updateReturnDate(@PathVariable int id, @RequestBody Date date){
        Library library = libraryRepository.findById(id).get();
        library.setReturnDate(date);
        return libraryRepository.saveAndFlush(library);
    }
}
