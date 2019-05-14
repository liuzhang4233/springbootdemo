package com.wxdemo.mapper;

import com.wxdemo.po.Book;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book")
    public List<Book> selectBooks();

    List<Book> selectBook2(Book book);

    @Insert("insert into book(title, price, publishDate) values(#{title}, #{price}, #{publicDate})")
    void addBookParam(@Param("title") String title,@Param("price") String price,@Param("publicDate") Date publicDate);

    @Insert("insert into book(title, price, publishDate) values(#{title}, #{price}, #{publicDate})")
    void addBookPo(Book book);

    @Update("update book set title = 'Java编程思想1' where id = ${id}")
    void updateBook(@Param("id") Integer id);

    void deleteBook(int id);

    @Delete("delete from book where id = #{id}")
    void deleteBook2(@Param("id") int id);
}
