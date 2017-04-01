package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangsong3 on 2017/3/31.
 */
@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view(){
        System.out.println("你已通过springMVC进入controller方法。。。。");
        return "login";
    }
}