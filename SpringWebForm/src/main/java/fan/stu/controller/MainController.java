package fan.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fan.stu.entity.User;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/convert-name", method = RequestMethod.GET)
    public String convertName(Model model) {
        
        model.addAttribute("user", new User());
        
        return "input-name";
    }

    @RequestMapping(value = "/convert-name", method = RequestMethod.POST)
    public ModelAndView convertName(@ModelAttribute("user") User user) {
        String oldName = user.getUserName();
        String newName = oldName.toUpperCase();

        ModelAndView mav = new ModelAndView();
        mav.addObject("newName", newName);
        mav.setViewName("view-name");

        return mav;
    }
}
