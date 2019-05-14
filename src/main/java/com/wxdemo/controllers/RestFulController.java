package com.wxdemo.controllers;

import com.wxdemo.mapper.BookMapper;
import com.wxdemo.po.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class RestFulController {

    @Resource
    private BookMapper bookMapper;

    @RequestMapping("bookList")
    @ResponseBody
    public List<Book> book1(HttpServletRequest request) {
        List<Book> books = bookMapper.selectBooks();
        System.out.println(books);
        return books;
    }
    @RequestMapping("selectBook2")
    @ResponseBody
    public List<Book> selectBook2(){
        Book book = new Book();
        book.setId(1);
        return bookMapper.selectBook2(book);
    }
    @RequestMapping("addBook")
    @ResponseBody
    public String addBook(){
        bookMapper.addBookParam("数学","100.00",new Date());
        return "ok";
    }
    @RequestMapping("addBookPo")
    @ResponseBody
    public String addBookPO(){
        bookMapper.addBookPo(new Book("语文","100.00",new Date()));
        return "ok";
    }

    @RequestMapping("updateBook")
    @ResponseBody
    public String updateBook(){
        bookMapper.updateBook(1);
        return "update-ok";
    }

    @RequestMapping("deleteBook")
    @ResponseBody
    public String deleteBook(){
        bookMapper.deleteBook(12);
        return "delete-ok";
    }

    @RequestMapping("deleteBook2")
    @ResponseBody
    public String deleteBook2(){
        bookMapper.deleteBook2(14);
        return "delete2-ok";
    }
}
