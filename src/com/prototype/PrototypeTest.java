package com.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.setBookShopName("Royal Books");
        bookShop.loadData();


        BookShop bookShop1 = null;
        try {
            bookShop1 = bookShop.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        bookShop1.setBookShopName("University Book Store");
        bookShop.getBooks().remove(2);
        System.out.println(bookShop);
        System.out.println(bookShop1);

    }
}
