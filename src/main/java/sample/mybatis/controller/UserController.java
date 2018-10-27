package sample.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sample.mybatis.domain.User;
import sample.mybatis.mapper.UserDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/15.
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "hello spring boot";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ResponseBody
    public String test2() {
        User user = new User();
        user.setName("ims");
        System.out.println(this.userDao.countByName(user));
        return this.userDao.countByName(user) + "哈哈哈";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public  Map<String, Object> testGetUser() {
        User user = new User();
        user.setName("ims");
        user.setId("0001");

        List<User> data = this.userDao.findAll(user);
        Map<String, Object> result = new HashMap<>();
        result.put("data", data);
        result.put("success", true);
        return result;
    }
}
