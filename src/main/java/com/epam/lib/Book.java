package com.epam.lib;

public class Book {
    private int id;
    private String name;
    private String author;
    private String price;


    public Book(int id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String showIdName(){
        return "ID: " + id + " Name: " + name;
    }

    public String showAuthorPrice(){
        return "Author: " + author + " Price: " + price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
