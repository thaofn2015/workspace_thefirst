package fan.stu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fan.stu.entity.User;

@Controller
public class MainController {

    @RequestMapping(value = { "/", "/index" })
    public String index(Model model) {

        model.addAttribute("user", new User());

        return "input-user";
    }

    @RequestMapping(value = "add-user", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") @Valid User user, BindingResult result) {

        if (result.hasErrors()) {
            return "input-user";
        }

        return "view-user";
    }
}
