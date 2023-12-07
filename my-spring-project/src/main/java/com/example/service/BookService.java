package com.example.service;

import com.example.dto.BookDetailDTO;

public interface BookService {
    public BookDetailDTO findBookDetailById(Long id);
}
