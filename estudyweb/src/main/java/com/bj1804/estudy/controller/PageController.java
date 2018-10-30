package com.bj1804.estudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {





    @RequestMapping("p_{pname}")
    public String a(@PathVariable("pname") String pname){
        System.out.println("进去页面"+pname);
        return pname;
    }





}
