package com.epam.lib;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(42,"FireHell","Simson","2589 грн");
        Book book2 = new Book();

        book2.setId(8);
        book2.setName("Sky");
        book2.setAuthor("Vova");
        book2.setPrice("5898 грн");

        System.out.println(book1);
        System.out.println(book2);
    }
}
