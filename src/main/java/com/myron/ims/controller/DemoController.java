package com.myron.ims.controller;

import com.myron.ims.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    private UserDao userinfoDao;

    // 测试路由器 http://localhost:9999/ 默认是8080,但我把他配置为9999了
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "hello spring boot";
    }

    // 测试路由器 http://localhost:9999/test2 默认是8080,但我把他配置为9999了
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ResponseBody
    public String test2() {

        return userinfoDao.findByUsername("test").getUsername();
    }

}