package com.wxdemo.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter("/")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletRequest.getServletContext().co
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        Cookie cookie = new Cookie("user","user");

    }

    @Override
    public void destroy() {

    }
}
