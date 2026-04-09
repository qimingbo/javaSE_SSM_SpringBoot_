package com.qmb.tx_xml;


import com.qmb.tx_xml.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean-tx.xml")
public class DiTest {
    @Autowired
    private BookController bookController;

    @Test
    public void TestDemo1()
    {
        bookController.buyBook(1,1);
    }


}
