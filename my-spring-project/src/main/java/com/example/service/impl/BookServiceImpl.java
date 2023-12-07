package com.example.service.impl;

import com.example.domain.Book;
import com.example.dto.BookDetailDTO;
import com.example.repository.BookRepository;
import com.example.service.BookService;

public class BookServiceImpl implements BookService {
    private Book book;

    private BookRepository bookRepository;

    // public BookServiceImpl() {
    // Autor autor = new Autor();
    // book = new Book(autor);
    // }

    @Override
    public BookDetailDTO findBookDetailById(Long bookId) {
        Book books = bookRepository.findBookById(bookId);

        if (books != null) {
            BookDetailDTO dto = new BookDetailDTO();
            dto.setBookId(books.getId());
            dto.setAutorName(books.getAutor().getName());
            dto.setBookTitle(books.getTitle());
            dto.setBookDescription(books.getDescription());
            return dto;
        } else {
            // Handle the case when the book is not found
            return null;
        }
    }

    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

}
