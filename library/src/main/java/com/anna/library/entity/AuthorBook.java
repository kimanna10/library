package com.anna.library.entity;

import javax.persistence.*;

@Entity
@Table(name="author_book")
public class AuthorBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "author_id")
    private int author_id;

    @Column(name = "book_id")
    private int book_id;

    public int getId() {
        return id;
    }

    public AuthorBook() {
    }
    public AuthorBook(int author_id, int book_id) {
        this.author_id = author_id;
        this.book_id = book_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
}
