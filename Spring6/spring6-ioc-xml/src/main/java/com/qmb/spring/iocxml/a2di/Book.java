package com.qmb.spring.iocxml.a2di;

public class Book {
    private String bname;
    private String author;
    private String others;

    public Book() {
        System.out.println("无参构造执行了");
    }

    public Book(String bname, String author, String others) {
        System.out.println("有参构造执行了");
        this.bname = bname;
        this.author = author;
        this.others = others;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
