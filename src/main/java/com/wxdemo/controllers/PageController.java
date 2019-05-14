package com.wxdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {


    @RequestMapping("index1")
    @ResponseBody
    public String index1() {
        System.out.println("index1");
        return "index1";
    }

    @RequestMapping("index2")
    public String index2() {
        System.out.println("index2");
        return "redirect:/index1";
    }

    @RequestMapping("index3")
    public String index3() {
        System.out.println("index3");
        return "index1";
    }


}
