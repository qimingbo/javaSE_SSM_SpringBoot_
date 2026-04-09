package com.qmb.tx_xml.controller;

import com.qmb.tx_xml.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(int userId, int bookId)
    {
        bookService.buyBook(userId,bookId);
    }



}
