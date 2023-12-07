package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.domain.Autor;
import com.example.dto.BookDetailDTO;
import com.example.service.BookService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContex = new ClassPathXmlApplicationContext("aplication-contex.xml");
        BookService bookService = (BookService) appContex.getBean("bookService");
        BookDetailDTO bookDetailDTO = bookService.findBookDetailById(1L);
        // System.out.print(bookDetailDTO);
        Autor autor = (Autor) appContex.getBean("autor");
        System.out.println("autor" + autor);
    }
}
