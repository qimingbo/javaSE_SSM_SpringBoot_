package com.qmb.dao;

import com.qmb.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper
public interface BookDao {
    public List<Book> selectAll();

    public Book selectById(@Param("id") Integer id);

    public void addBook(@Param("book")Book book );

    public void modifyBook(@Param("book") Book book);

    public void deleteById(@Param("id") Integer id);
}
