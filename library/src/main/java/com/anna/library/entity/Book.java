package com.anna.library.entity;

import javax.persistence.*;
import java.lang.invoke.LambdaConversionException;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private int quantity;
    private boolean isAvailable;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<Library> clients;

    @ManyToMany(mappedBy = "bookList", fetch = FetchType.LAZY)
    private List<Author> authorList;

    @ManyToMany(mappedBy = "bookList", fetch = FetchType.LAZY)
    private List<Genre> genreList;

    public Book() {
    }
    public Book(String title, String description,boolean isAvailable,int quantity) {
        this.title = title;
        this.description = description;
        this.isAvailable = isAvailable;
        this.quantity =quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Library> getClients() {
        return clients;
    }

    public void setClients(List<Library> clients) {
        this.clients = clients;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
