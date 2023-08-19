package com.epam.lib;

public class Book {
    private int id;
    private String name;
    private String author;
    private int price;


    public Book(int id, String name, String author, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String showIdAndName(){
        return "ID: " + id + " Name: " + name;
    }

    public String showAuthorAndPrice(){
        return "Author: " + author + " Price: " + price;
    }

    public String showPriceInEURO() {
        return "Price: " + price/42 + " EURO";
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
