package com.api.book.bootrestbook.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {

    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(11, "Java API Guide", "abc"));
    // list.add(new Book(12, "Java made easy", "utyuu"));
    // list.add(new Book(13, "Intro to python", "go"));
    // }

    @Autowired
    private BookRepository bookRepository;

    // get all books
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    // get single book by id
    public Book getBookById(int id) {
        Book book = null;

        try {
            // book = list.stream().filter(e -> e.getId() == id).findFirst().get();

            book = this.bookRepository.findById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // adding a book
    public Book addBook(Book b) {
        Book result = bookRepository.save(b);
        return result;
    }

    // delete book
    public void deleteBook(int bid) {
        // list = list.stream().filter(e -> e.getId() !=
        // bid).collect(Collectors.toList());

        bookRepository.deleteById(bid);
    }

    // update the book
    public void updateBook(Book book, int bookId) {
        // list = list.stream().map(b -> {
        // if (b.getId() == bookId) {
        // b.setTitle(book.getTitle());
        // b.setAuthor(book.getAuthor());
        // }
        // return b;
        // }).collect(Collectors.toList());
        
        book.setId(bookId);
        bookRepository.save(book);
    }
}
