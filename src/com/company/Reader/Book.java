package com.company.Reader;

public class Book {
    private String title;
    private String authorName;

    /**
     * Конструктор с параметром.
     * @param title - название книги.
     */
    public Book(String title) {
        this.title = title;
    }

    private Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
