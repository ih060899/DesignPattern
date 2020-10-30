package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String bookShopName;
    private List<Book> books = new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 15; i++) {
            Book book = new Book(i, "Name : " + i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for (Book book : this.getBooks()
        ) {
            bookShop.getBooks().add(book);

        }
        return bookShop;
    }
}
