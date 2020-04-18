package com.anna.library.controller;


import com.anna.library.entity.AuthorBook;
import com.anna.library.entity.Genre;
import com.anna.library.entity.GenreBook;
import com.anna.library.repository.GenreBookRepository;
import com.anna.library.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private GenreBookRepository genrebookRepository;

    @GetMapping("/all")   //  get all genres from db
    public List<Genre> getAllGenres(){
        return genreRepository.findAll();
    }

    @GetMapping("/{id}")  //  get genre by id
    public Genre getGenreById(@PathVariable int id){
        return genreRepository.findById(id).get();
    }

    @GetMapping("/find/")  //  find genre by title
    public List<Genre> getByTitleContaining(@RequestParam("title") String title){
        return genreRepository.findAllByTitleContains(title);
    }
    @PostMapping("/assign")   //  assign book to genre
    public GenreBook assignBookToGenre(@RequestBody GenreBook genrebook) {
        return genrebookRepository.saveAndFlush(genrebook);
    }
    @PostMapping("/create")   //  create genre
    public Genre createGenre(@RequestBody Genre genre) {
        return genreRepository.saveAndFlush(genre);
    }

    @PutMapping("/update/{id}") //  update genre
    public Genre updateGenre(@PathVariable int id, @RequestBody Genre genre){
        genre.setId(id);
        return genreRepository.saveAndFlush(genre);
    }

}
