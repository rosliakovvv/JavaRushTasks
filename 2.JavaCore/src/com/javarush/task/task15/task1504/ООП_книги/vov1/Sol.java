package com.javarush.task.task15.task1504.ООП_книги.vov1;

import java.util.LinkedList;
import java.util.List;

public class Sol {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();

    }

    public static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }
    }

}
