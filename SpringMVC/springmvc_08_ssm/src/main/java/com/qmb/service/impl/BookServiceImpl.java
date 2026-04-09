package com.qmb.service.impl;

import com.qmb.dao.BookDao;
import com.qmb.entity.Book;
import com.qmb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl  implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void modifyBook(Book book) {
        bookDao.modifyBook(book);
    }

    @Override
    public void deleteById(Integer id) {
        bookDao.deleteById(id);
    }
}
