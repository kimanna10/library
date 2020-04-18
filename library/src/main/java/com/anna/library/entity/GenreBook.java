package com.anna.library.entity;

import javax.persistence.*;

@Entity
@Table(name = "genre_book")
public class GenreBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "genre_id")
    private int genre_id;

    @Column(name = "book_id")
    private int book_id;



    public GenreBook() {
    }
    public GenreBook(int genre_id, int book_id) {
        this.genre_id = genre_id;
        this.book_id = book_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
}
