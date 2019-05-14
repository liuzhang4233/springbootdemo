package com.wxdemo.test;

import com.example.wxdemo.main.WxdemoApplication;
import com.wxdemo.mapper.BookMapper;
import com.wxdemo.po.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = WxdemoApplication.class)
@EnableAutoConfiguration
public class BookMapperTest {

    @Resource
    public BookMapper bookMapper;

    @Test
    public void test1() {
        List<Book> books = bookMapper.selectBooks();
        System.out.println(books);
    }

    @Test
    public void test() throws Exception {
//        String driver = "com.mysql.jdbc.Driver";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ssm";
        String username = "root";
        String password = "root";
        Connection conn = null;
        Class.forName(driver); //classLoader,加载对应驱动
        conn = (Connection) DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from book");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("title"));
        }
    }
}