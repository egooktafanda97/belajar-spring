package com.example.domain;

import java.io.Serializable;

public class Book implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6766478615626660112L;

    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    private Long id;
    private String title;
    private String description;

    public Book(Autor autor) {
        super();
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
