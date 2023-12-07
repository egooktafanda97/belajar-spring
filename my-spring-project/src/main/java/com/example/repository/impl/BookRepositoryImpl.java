package com.example.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.example.domain.Autor;
import com.example.domain.Book;
import com.example.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {
    private Map<Long, Book> bookMap;

    public BookRepositoryImpl() {
        super();
        bookMap = new HashMap<Long, Book>();

        Autor autor = new Autor();
        autor.setId(1L);
        autor.setName("ego oktafanda");
        autor.setBirtDate(-16401L);

        Book book1 = new Book(autor);
        book1.setId(1L);
        book1.setTitle("The Secret");
        book1.setDescription("rahasia");
        bookMap.put(book1.getId(), book1);
    }

    @Override
    public Book findBookById(Long id) {
        Book books = bookMap.get(id);
        return books;
    }
}
