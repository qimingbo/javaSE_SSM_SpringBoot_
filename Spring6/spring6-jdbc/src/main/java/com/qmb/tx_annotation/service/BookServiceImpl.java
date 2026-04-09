package com.qmb.tx_annotation.service;

import com.qmb.tx_annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBook(int userId, int bookId) {
        // 1.根据bookId查询价格
        int price = bookDao.getPriceByBookId(bookId);
        // 2.修改书本库存
        bookDao.updateStockByBookId(bookId);
        // 3.修改用户的余额
        bookDao.updateByUserId(userId,price);
    }
}
