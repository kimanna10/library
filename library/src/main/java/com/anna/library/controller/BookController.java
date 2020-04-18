package com.anna.library.controller;

import com.anna.library.entity.Book;
import com.anna.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/all")  //  get all books from db
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}") //  get book by id
    public Book getBookById(@PathVariable int id){
        return bookRepository.findById(id).get();
    }
    // /client/find/?name=Anna
    // /client/find/?name=Anna$age
    @GetMapping("/findTitle/")  //  find book by title
    public List<Book> getByTitleContaining(@RequestParam("title") String title){
        return bookRepository.findAllByTitleContains(title);
    }

    @GetMapping("/findDescription/")  //  find book by description
    public List<Book> getByDescriptionContaining(@RequestParam("description") String description){
        return bookRepository.findAllByDescriptionContains(description);
    }

    @PostMapping("/create")   //  create book
    public Book createBook(@RequestBody Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @PutMapping("/update/{id}") //  update book
    public Book updateBook(@PathVariable int id, @RequestBody Book book){
        book.setId(id);
        return bookRepository.saveAndFlush(book);
    }

    @PatchMapping("/updateTitle/{id}")  //  update book's title
    public Book updateBookTitle(@PathVariable int id, @RequestBody String title){
        Book book = bookRepository.findById(id).get();
        book.setTitle(title);
        return bookRepository.saveAndFlush(book);
    }
    @PatchMapping("/updateDesc/{id}")  //  update book's description
    public Book updateBookDesc(@PathVariable int id, @RequestBody String description){
        Book book = bookRepository.findById(id).get();
        book.setDescription(description);
        return bookRepository.saveAndFlush(book);
    }
    @PatchMapping("/updateAvailable/{id}")  //  update book's availability
    public Book updateBookAvailable(@PathVariable int id, @RequestBody boolean is_available){
        Book book = bookRepository.findById(id).get();
        book.setAvailable(is_available);
        return bookRepository.saveAndFlush(book);
    }

    @PatchMapping("/updateQuantity/{id}")  //  update book's quantity
    public Book updateBookQuantity(@PathVariable int id, @RequestBody int quantity){
        Book book = bookRepository.findById(id).get();
        book.setQuantity(quantity);
        return bookRepository.saveAndFlush(book);
    }

}
