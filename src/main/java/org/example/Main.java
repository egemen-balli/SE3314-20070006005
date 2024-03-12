package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title1", "author1", "ISBN1");
        Book book2 = new Book("title2", "author2", "ISBN2");
        Book book3 = new Book("title3", "author3", "ISBN3");
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Book searchedBook = library.searchBook("author2");

        library.borrowBook(searchedBook);
        library.returnBook(searchedBook);
    }
}