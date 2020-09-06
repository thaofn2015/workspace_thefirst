package fan.stu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = { "/", "index" })
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login-page");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@RequestParam(value = "error", required = false) final String error, Model model) {
        
        if(error != null) {
            model.addAttribute("message", "Login failed!!!");
        }
        
        return "login-page";
    }

    @RequestMapping(value = "/user-info", method = RequestMethod.GET)
    public ModelAndView userInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user-info");
        return mav;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin-page");
        return mav;
    }

    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public ModelAndView denied() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("denied-page");
        return mav;
    }
}
