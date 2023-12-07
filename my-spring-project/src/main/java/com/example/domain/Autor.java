package com.example.domain;

public class Autor {
    private Long id;
    private String name;
    private Long birtDate;

    public Autor(Long id, String name, Long birtDate) {
        super();
        this.id = id;
        this.name = name;
        this.birtDate = birtDate;
    }

    public Autor(Long id, Long birtDate, String name) {
        super();
        this.id = id;
        this.name = name;
        this.birtDate = birtDate;
    }

    public Autor() {
        super();
    }

    public Autor(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Long birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", birtDate='" + getBirtDate() + "'" +
                "}";
    }

}
