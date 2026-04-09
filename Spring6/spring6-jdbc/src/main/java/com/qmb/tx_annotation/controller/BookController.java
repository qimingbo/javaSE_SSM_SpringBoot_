package com.qmb.tx_annotation.controller;

import com.qmb.tx_annotation.service.BookService;
import com.qmb.tx_annotation.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(int userId, int bookId)
    {
        bookService.buyBook(userId,bookId);
    }



    public void checkout(int[] bookIds, Integer userId){
        checkoutService.checkout(bookIds, userId);
    }

}
