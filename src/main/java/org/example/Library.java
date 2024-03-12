package org.example;

import java.util.ArrayList;
import java.util.List;
public class Library {


    List<Book> books = new ArrayList<>();


    void addBook(Book b) throws IllegalArgumentException {
        if(b != null){
            books.add(b);
            System.out.println("Added book: " + b.getTitle());
        }else {
            throw new IllegalArgumentException();
        }
    }


    Book searchBook(String string) {
        for (Book b: books) {
            if (b.getTitle().equals(string) || b.getAuthor().equals(string)) {
                System.out.println("Found book: " + b.getTitle());
                return b;
            }
        }
        return null;
    }


    void borrowBook(Book b) {
        if(b.isAvailable()) {
            b.setAvailable(false);
            System.out.println("Book borrowed: " + b.getTitle());
        }
    }


    void returnBook(Book b) {
        b.setAvailable(true);
        System.out.println("Book returned: " + b.getTitle());
    }
}