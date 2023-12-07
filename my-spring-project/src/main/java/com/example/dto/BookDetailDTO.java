package com.example.dto;

import java.io.Serializable;

public class BookDetailDTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 8127106156771009926L;
    private Long bookId;
    private String autorName;
    private String bookTitle;
    private String bookDescription;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "BookDetailDTO [bookId=" + bookId + ", autorName=" + autorName + ", bookTitle=" + bookTitle
                + ", bookDescription=" + bookDescription + "]";
    }

}
