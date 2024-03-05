package org.example;

public class Book {
    /**
     * title of the Book
     */
    String title;

    /**
     * author of the Book
     */
    String author;

    /**
     * ISBN of the Book
     */
    String ISBN;

    /**
     * Book's availability status
     */
    boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        isAvailable = true;
    }

    /**
     *
     * @return Book's title string
     */
    public String getTitle() {
        return title;
    }

    /**
     * sets the title of the Book
     * @param title new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return Book's author string
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @return Book's availability status
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * sets the Book's availability status
     * @param available new availability status
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
