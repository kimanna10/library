package com.anna.library.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "client_id")
    private int client_id;

    @Column(name = "book_id")
    private int book_id;

    private Date issueDate;
    private Date returnDate;

    public Library(int client_id, int book_id , Date issueDate, Date returnDate) {
        this.client_id = client_id;
        this.book_id = book_id;
        this.issueDate =issueDate;
        this.returnDate=returnDate;
    }

    public Library() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

//    @Override
//    public String toString() {
//        return "Library{" +
//                "id=" + id +
//                ", client=" + client +
//                ", book=" + book +
//                ", issueDate=" + issueDate +
//                ", returnDate=" + returnDate +
//                '}';
//    }
}
