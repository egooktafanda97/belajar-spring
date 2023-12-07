package com.example.repository;

import com.example.domain.Book;

public interface BookRepository {
    public Book findBookById(Long id);
}
