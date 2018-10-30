package com.bj1804.estudy.controller;


import com.bj1804.estudy.entity.Business;
import com.bj1804.estudy.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("hello")
    @ResponseBody
    public Object test(){
        return "Hello Spring MVC!";
    }

    @RequestMapping("findbyid{id}")
    @ResponseBody
    public Object findById(@PathVariable("id") int id){
        try{
            return businessService.loadBusinessById(id);
        }   catch (Exception ex){
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public Object update(Business business){
        try{
            return businessService.updateBusiness(business);
        }   catch (Exception ex){
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

}
