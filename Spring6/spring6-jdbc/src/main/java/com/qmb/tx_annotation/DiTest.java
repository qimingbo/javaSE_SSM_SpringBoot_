package com.qmb.tx_annotation;

import com.qmb.tx_annotation.config.SpringConfig;
import com.qmb.tx_annotation.config.TransactionConfig;
import com.qmb.tx_annotation.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(classes = {SpringConfig.class, TransactionConfig.class})
public class DiTest {
    @Autowired
    private BookController bookController;

    @Test
    public void TestDemo1()
    {
        bookController.buyBook(1,1);
    }

    // 测试事务的传播行为REQUIRED和REQUIRES-NEW的区别
    @Test
    public void TestDemo2()
    {
        int[] bookIds = {1, 2};
        bookController.checkout(bookIds,1);

    }
}
