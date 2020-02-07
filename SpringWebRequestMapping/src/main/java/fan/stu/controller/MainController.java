package fan.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/pathvariable/{id}")
    public String pathVariable(@PathVariable("id") String id, Model model) {

        model.addAttribute("id", id);

        return "pathVar";
    }

    @RequestMapping("/pathvariable2/{id}/{name}")
    public String pathVariable2(@PathVariable("id") String id, @PathVariable("name") String name, Model model) {

        model.addAttribute("id", id);
        model.addAttribute("name", name);

        return "pathVar2";
    }

    @RequestMapping("/requestparam")
    public String requestParam(@RequestParam("lastname") String lastName, @RequestParam("firstname") String firstName,
                               @RequestParam("age") int age, Model model) {

        model.addAttribute("lastname", lastName);
        model.addAttribute("firstname", firstName);
        model.addAttribute("age", age);
        
        return "requestParam";
    }
}
