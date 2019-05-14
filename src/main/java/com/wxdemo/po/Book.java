package com.wxdemo.po;

import java.util.Date;

public class Book {

    private int id;
    private String title;
    private String price;
    private Date publicDate;

    public Book() {
    }

    public Book(String title, String price, Date publicDate) {
        this.title = title;
        this.price = price;
        this.publicDate = publicDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", publicDate=" + publicDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }
}
