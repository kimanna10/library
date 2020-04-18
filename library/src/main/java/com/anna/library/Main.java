package com.anna.library;

//import com.anna.library.config.SpringConfig;
import com.anna.library.entity.*;
import com.anna.library.repository.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.security.timestamp.TSRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
//    private static int choice = 1 ;
//    public static final DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
//        AuthorRepository authorRepository = context.getBean("authorRepository", AuthorRepository.class);
//        ClientRepository clientRepository = context.getBean("clientRepository", ClientRepository.class);
//        LibraryRepository libraryRepository = context.getBean("libraryRepository", LibraryRepository.class);
//        GenreRepository genreRepository = context.getBean("genreRepository", GenreRepository.class);
//        System.out.println(libraryRepository.findByClient_idContains(2));
//    }
//
//
//        Scanner in = new Scanner(System.in);
//        while(choice!=0){
//            System.out.println("Welcome to Library!");
//            System.out.println("Please, choose the option: ");
//            System.out.println("1) Add book: ");
//            System.out.println("2) Search book: ");
//            System.out.println("3) Borrow book: ");
//            System.out.println("4) Show information about all books: ");
//            System.out.println("5) Show information about all client: ");
//            System.out.println("0) Exit: ");
//            choice = in.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("1) Add book: ");
//                    System.out.println("Title: ");
//                    String title = in.next();
//                    System.out.println("Description: ");
//                    String description = in.next();
//                    System.out.println("Quantity: ");
//                    int quantity = in.nextInt();
//                    System.out.println("Choose author: ");
//                    for(Author author: authorRepository.findAll()){
//                        System.out.println(author.getId()+") "+author.getName());
//                    }
//                    int authorId = in.nextInt();
//                    System.out.println("Genre: ");
//                    for(Genre genre: genreRepository.findAll()){
//                        System.out.println(genre.getId()+") "+genre.getTitle());
//                    }
//                    int genreId = in.nextInt();
//
//                    Book book1 = new Book(title, description,true, quantity);
//                    bookRepository.save(book1);
//
//                    Author author = authorRepository.findById(authorId).get();
//                    List<Book> bookList1 = author.getBookList();
//                    bookList1.add(book1);
//                    author.setBookList(bookList1);
//                    authorRepository.save(author);
//
//                    Genre genre = genreRepository.findById(genreId).get();
//                    List<Book> bookList2 = genre.getBookList();
//                    bookList2.add(book1);
//                    genre.setBookList(bookList2);
//                    genreRepository.save(genre);
//
//                    System.out.println("This book successfully added!");
//                    break;
//
//                case 2:
//                    System.out.println("2) Search book: ");
//                    System.out.println("   1. Search by Title: ");
//                    System.out.println("   2. Search by Author: ");
//                    int ch = in.nextInt();
//                    if(ch==1) {
//                        System.out.println("Please enter the title: ");
//                        String titleFind = in.next();
//                        List<Book> list = bookRepository.findAll();
//                        for (Book b : list) {
//                            if (b.getTitle().equals(titleFind)) {
//                                b.toString();
//                            }
//                        }
//                    }
//                    if(ch==2) {
//
//                        System.out.println("Please enter the name of Author: ");
//                        String nameFind = in.next();
//                        List<Author> list1 = authorRepository.findAll();
//                        for (Author a : list1) {
//                            if (a.getName().equals(nameFind)) {
//                                a.getBookList();
//                            }
//                        }
//
//                    }
//
//
//                    break;
//                case 3:
//                    System.out.println("3) Borrow book: ");
//                    System.out.println("Choose the client: ");
//                    for(Client client: clientRepository.findAll()){
//                        System.out.println(client.getId()+") "+client.getName());
//                    }
//                    int idClient = in.nextInt();
//
//                    System.out.println("Choose the book: ");
//                    for(Book book: bookRepository.findAll()){
//                        System.out.println(book.getId()+") "+book.getTitle());
//                    }
//                    int idBook = in.nextInt();
//                    Book book2 = bookRepository.findById(idBook).get();
//                    int q = book2.getQuantity();
//                    q--;
//                    Date date = new Date();
//
//                    Library library1 = new Library(idClient, idBook, date, date );
//                    libraryRepository.save(library1);
//
//                    break;
//                case 4:
//                    System.out.println("4) Show information about all books: ");
//                    for(Book book: bookRepository.findAll()){
//                        System.out.println(book.toString());
//                    }
//                    break;
//                case 5:
//                    System.out.println("5) Show information about all client: ");
//                        for(Library library: libraryRepository.findAll()){
//                        System.out.println(library.toString());
//                    }
//                    break;
//                case 0:
//                    break;
//
//            }
//        }
//
//
//    }
}
