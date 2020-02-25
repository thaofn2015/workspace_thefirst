package fan.stu.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fan.stu.spring.model.ListUser;
import fan.stu.spring.model.User;

@Controller
public class MainController {

    @RequestMapping(value = { "/", "/index" })
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/xml1")
    @ResponseBody
    public User xml1() {
        User user = new User();
        user.setId(1);
        user.setName("Phan Thao");
        user.setEmail("thao.phangoc@gmail.com");

        return user;
    }

    @RequestMapping(value = "/xml2")
    @ResponseBody
    public ListUser xml2() {
        List<User> users = new ArrayList<User>();

        User user1 = new User();
        user1.setId(1);
        user1.setName("Phan Thao");
        user1.setEmail("thao.phangoc@gmail.com");
        users.add(user1);

        User user2 = new User();
        user2.setId(1);
        user2.setName("Phan Thao");
        user2.setEmail("thao.phangoc@gmail.com");
        users.add(user2);

        ListUser listUser = new ListUser();
        listUser.setUser(users);
        return listUser;
    }

}
