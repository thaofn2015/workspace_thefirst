package fan.stu.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fan.stu.spring.model.User;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/json1")
    @ResponseBody
    public User json1() {
        User user = new User();
        user.setId(1);
        user.setName("Phan Thao");
        user.setEmail("thao.phangoc@gmail.com");

        return user;
    }

    @RequestMapping(value = "/json2")
    @ResponseBody
    public List<User> json2() {
        List<User> listUser = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setName("Phan Thao");
        user.setEmail("thao.phangoc@gmail.com");
        listUser.add(user);
        listUser.add(user);
        
        return listUser;
    }
}
