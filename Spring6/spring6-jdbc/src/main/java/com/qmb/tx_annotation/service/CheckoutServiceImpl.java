package com.qmb.tx_annotation.service;

import com.qmb.tx_annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    // 这个实现类是为了模拟事务的传播行为
    @Autowired
    private BookService bookService;

    @Override
    public void checkout(int[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
