package com.qmb.service;

import com.qmb.entity.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookService {

    public List<Book> selectAll();

    public Book selectById(Integer id);

    public void addBook(Book book);

    public void modifyBook(Book book);

    public void deleteById(Integer id);
}
