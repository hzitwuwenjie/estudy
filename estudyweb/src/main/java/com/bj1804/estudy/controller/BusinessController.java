package com.bj1804.estudy.controller;


import com.aliyun.oss.OSSClient;
import com.bj1804.estudy.entity.Business;
import com.bj1804.estudy.services.BusinessService;
import com.bj1804.estudy.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
@RequestMapping("business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private OSSClient oSSClient;

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
    //通过控制器跳转到页面:查询企业信息。然后转发到页面上显示
    //Spring容器会给我们注入一个叫做 ModelMap的对象。可以用来在后台存值
    //你只需要将ModelMap的对象声明方法的参数即可
    @RequestMapping("businessById{id}")
    public  String  accountMsg(@PathVariable("id") int id ,ModelMap map){
        //调用业务获得企业信息
        Business business=businessService.loadBusinessById(id);
        //存储到ModealMap中.为了转发到页面上显示
        map.put("business",business);
        return "a";
    }


    @RequestMapping("uploadfile")
    @ResponseBody
    public Object uploadLogo(@RequestParam("file") CommonsMultipartFile file,@RequestParam("businessid") int businessid) throws IOException {
        InputStream inputStream = null;
        ResponseVo vo = new ResponseVo();

        String fname = file.getOriginalFilename(); //获取上传的文件名
        String stuff = fname.substring(fname.lastIndexOf(".")); //获取后缀
        String newfile = businessid + stuff; //以企业ID为每一个企业定义一个新的名字

        //将上传的文件file转移到自己的文件nfile中
        try {
            inputStream = file.getInputStream();
            //直接将文件上传到阿里云服务器上
            oSSClient.putObject("bj1804", newfile, file.getInputStream());
            String logourl = oSSClient.getEndpoint().toString().replace("http://", "http://bj1804.") + "/" + newfile;
            vo.setData(logourl);
            //更新企业信息
            Business business = new Business(businessid);
            business.setLogo(logourl);
            businessService.updateBusiness(business);
            vo.setMsg("success");

        } catch (IOException e) {
            e.printStackTrace();
            vo.setCode(1);
            vo.setMsg(e.getMessage());
        } finally {
            inputStream.close();
        }
        return vo;
    }











}
