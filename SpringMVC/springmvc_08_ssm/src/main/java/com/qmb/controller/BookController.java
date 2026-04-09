package com.qmb.controller;

import com.qmb.config.SpringConfig;
import com.qmb.entity.Book;
import com.qmb.exception.BusinessException;
import com.qmb.exception.SystemException;
import com.qmb.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    // 查询所有
    @GetMapping()
    public Result selectAll()
    {
        return new Result(Code.GET_OK,bookService.selectAll(),"查询成功");
    }

    //查询单个
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id)
    {
        if(id == 1) throw new BusinessException(Code.BUSINESS_ERR,"不要试了,我的代码很健壮");
        try {
            int a = 1/0;
        }catch (ArithmeticException e)
        {
            throw new SystemException(Code.BUSINESS_ERR,"系统繁忙,请稍后再试");
        }

        return new Result(Code.GET_OK,bookService.selectById(id),"查询成功");
    }


    // 添加用户
    @PostMapping()
    public Result addBook(@RequestBody Book book)
    {
        bookService.addBook(book);
        return  new Result(Code.SAVE_OK,"添加成功");
    }

    // 修改用户
    @PutMapping()
    public Result modifyBook(@RequestBody Book book)
    {
        bookService.modifyBook(book);
        return new Result(Code.UPDATE_OK,"修改成功");
    }

    // 删除
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id)
    {
        bookService.deleteById(id);
        return new Result(Code.DELETE_OK,"删除成功");
    }
}
